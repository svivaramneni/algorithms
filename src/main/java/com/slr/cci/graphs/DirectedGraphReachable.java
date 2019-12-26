package com.slr.cci.graphs;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraphReachable {


	public static void main(String[] args) {

		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);

		//Relationships
		a.dependencies.add(b);

		b.dependencies.add(c);
		b.dependencies.add(d);

		//d.dependencies.add(e);
		d.dependencies.add(f);


		List<Node> alreadySeen = new ArrayList<>();

		Found found = new Found();

		isReachable(a, e, alreadySeen, found);

		System.out.println(found.isFoundPath());
	}

	public static void isReachable(Node parent, Node child, List<Node> visited, Found f) {

		if (parent.data.equals(child.data) || f.isFoundPath()) {
			f.setFoundPath(true);
			return;
		}

		visited.add(parent);

		List<Node> adjacents = parent.getDependencies();

		for (Node n : adjacents) {
			if (!visited.contains(n))
				isReachable(n, child, visited, f);
		}

	}


	static class Node {
		Integer data;
		List<Node> dependencies;

		Node(Integer data) {
			this.data = data;
			dependencies = new ArrayList<>();
		}

		public List<Node> getDependencies() {
			return dependencies;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}

	static class Found {
		boolean foundPath;

		public boolean isFoundPath() {
			return foundPath;
		}

		public void setFoundPath(boolean foundPath) {
			this.foundPath = foundPath;
		}
	}
}
