package imports;

public interface IMapE<K,V> {
	boolean equals(Object o);
	K getKey();
	V getValue();
	int hashCode();
	V setValue(V value);
}
