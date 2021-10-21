package telran.list.interfaces;

public interface IList<E> extends Iterable<E> {
	int size();

	boolean isEmpty();

	boolean add(E element);

	void clear();

	boolean contains(Object o);

	boolean remove(Object o);

	boolean add(int index, E element);

	E get(int index);

	int indexOf(Object o);

	int lastIndexOf(Object o);

	E remove(int index);

	E set(int index, E element);
}
