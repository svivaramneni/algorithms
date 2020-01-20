package com.slr.servicenow;

interface Cache<K, V> {
	void setStore(Store store);

	V get(K key);

	void put(K key, V value);
}

interface Store<K, V> {

	V get(K key);

	void put(K key, V value);

}

class SimpleCache<K, V> implements Cache<K, V> {

	private Store<K, V> store;

	@Override
	public void setStore(Store store) {
		this.store = store;
	}

	@Override
	public V get(K key) {
		return this.store.get(key);
	}

	@Override
	public void put(K key, V value) {
		this.store.put(key, value);
	}
}


class LruCache<K, V> implements Cache<K, V> {

	private Store<K, V> store; // value would DNode

	@Override
	public void setStore(Store store) {
		this.store = store;
	}

	@Override
	public V get(K key) {
		//mark it
		//Bring it first
		//Remove current location.
		return this.store.get(key);
	}

	@Override
	public void put(K key, V value) {
		//mark it
		//do a size check if needed, delete last one
		//Add it at beginning
		this.store.put(key, value);
	}

	void remove(V value) {
		//delete
	}
}


class Solution {
	public static void main(String[] args) {

		System.out.println();

	}
}
