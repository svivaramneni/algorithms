package com.slr;

import java.util.Collection;
import java.util.HashSet;

public class CountingHashSet<E> extends HashSet<E> {

	private int addCount = 0;

	@Override
	public boolean add(E e) {
		addCount += 1;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<?
			extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

}
