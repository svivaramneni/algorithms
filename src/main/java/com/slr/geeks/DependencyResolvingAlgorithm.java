package com.slr.geeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DependencyResolvingAlgorithm {

	public static void main(String[] args) {

		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");

		//Relationships
		a.dependencies.add(d);
		a.dependencies.add(f);

		b.dependencies.add(d);

		d.dependencies.add(c);

		f.dependencies.add(b);

		//Arrays.sort
		//c.dependencies.add(e);


		//circular relationship
		//d.dependencies.add(b);

		//Stack

		List<Node> resolved = new ArrayList<>();
		List<Node> alreadySeen = new ArrayList<>();

		dependencyOrder(a, resolved, alreadySeen);

		System.out.println(resolved);
	}

	private static void dependencyOrder(Node a, List<Node> resolved, List<Node> alreadySeen) {
		alreadySeen.add(a);
		for (Node dep : a.dependencies) {
			if (!resolved.contains(dep)) {
				if (alreadySeen.contains(dep))
					throw new RuntimeException("Loop");
				dependencyOrder(dep, resolved, alreadySeen);
			}
		}
		resolved.add(a);
	}

	static class Node {
		String data;
		List<Node> dependencies;

		Node(String data) {
			this.data = data;
			dependencies = new ArrayList<>();
		}

		public List<Node> getDependencies() {
			return dependencies;
		}

		@Override
		public String toString() {
			return data;
		}
	}
}
