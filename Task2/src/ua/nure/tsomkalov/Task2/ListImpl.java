package ua.nure.tsomkalov.Task2;

public class ListImpl implements List {

	private Object[] ar;

	@Override
	public void add(Object el) {
	}

	@Override
	public void addAll(List list) {
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public void clear() {
	}

	@Override
	public boolean contains(Object el) {
		return false;
	}

	@Override
	public Object get(int index) {
		return null;
	}

	@Override
	public int indexOf(Object el) {
		return 0;
	}

	@Override
	public Object remove(int j) {
		return null;
	}

	@Override
	public boolean remove(Object el) {
		return false;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public Iterator iterator() {
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println("~~~ list A B C");
		System.out.println("~~~ Result: [A, B, C]");
		List list = new ListImpl();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);

		System.out.println("~~~ list2: D E F");
		System.out.println("~~~ Result: [D, E, F]");
		List list2 = new ListImpl();
		list2.add("D");
		list2.add("E");
		list2.add("F");
		System.out.println(list2);

		System.out.println("~~~ list.addAll(list2)");
		System.out.println("~~~ Result: [A, B, C, D, E, F]");
		list.addAll(list2);
		System.out.println(list);

		System.out.println("~~~ list.add(C)");
		System.out.println("~~~ Result: [A, B, C, D, E, F, C]");
		list.add("C");
		System.out.println(list);

		System.out.println("~~~ list.clear()");
		System.out.println("~~~ Result: []");
		list.clear();
		System.out.println(list);

		System.out.println("~~~ list.addAll(list2)");
		System.out.println("~~~ Result: [D, E, F]");
		list.addAll(list2);
		System.out.println(list);

		System.out.println("~~~ list.contains(E)");
		System.out.println("~~~ Result: true");
		System.out.println(list.contains("E"));

		System.out.println("~~~ list.contains(�)");
		System.out.println("~~~ Result: false");
		System.out.println(list.contains("C"));

		System.out.println("~~~ list.indexOf(D)");
		System.out.println("~~~ Result: 0");
		System.out.println(list.indexOf("D"));

		System.out.println("~~~ list.get(2)");
		System.out.println("~~~ Result: F");
		System.out.println(list.get(2));

		System.out.println("~~~ list.indexOf(F)");
		System.out.println("~~~ Result: 2");
		System.out.println(list.indexOf("F"));

		System.out.println("~~~ list.size()");
		System.out.println("~~~ Result: 3");
		System.out.println(list.size());

		System.out.println("~~~ list");
		System.out.println("~~~ Result: [D, E, F]");
		System.out.println(list);

		System.out.println("~~~ list.remove(1)");
		System.out.println("~~~ Result: [D, F]");
		list.remove(1);
		System.out.println(list);

		System.out.println("~~~ list.remove(F)");
		System.out.println("~~~ Result: [D]");
		list.remove("F");
		System.out.println(list);

		System.out.println("~~~ list.size()");
		System.out.println("~~~ Result: 1");
		System.out.println(list.size());

		System.out.println("~~~ list.addAll(list2)");
		System.out.println("~~~ Result: [D, D, E, F]");
		list.addAll(list2);
		System.out.println(list);

		System.out.println("~~~ foreach list");
		System.out.println("~~~ Result: D D E F");
		for (Object el : list) {
			System.out.print(el + " ");
		}
		System.out.println();

		System.out.println("~~~ Iterator it = list.iterator()");
		Iterator it = list.iterator();

		System.out.println("~~~ it.next()");
		System.out.println("~~~ Result: D");
		System.out.println(it.next());

		System.out.println("~~~ it.next()");
		System.out.println("~~~ Result: D");
		System.out.println(it.next());

		System.out.println("~~~ it.remove()");
		System.out.println("~~~ Result: [D, E, F]");
		it.remove();
		System.out.println(list);

		System.out.println("~~~ it.next()");
		System.out.println("~~~ Result: E");
		System.out.println(it.next());

		System.out.println("~~~ it.remove()");
		System.out.println("~~~ Result: [D, F]");
		it.remove();
		System.out.println(list);

		System.out.println("~~~ it.next()");
		System.out.println("~~~ Result: F");
		System.out.println(it.next());

		System.out.println("~~~ it.remove()");
		System.out.println("~~~ Result: [D]");
		it.remove();
		System.out.println(list);

		System.out.println("~~~ list.remove(D)");
		System.out.println("~~~ Result: []");
		list.remove("D");
		System.out.println(list);

		System.out.println("~~~ list.addAll(list2)");
		System.out.println("~~~ Result: [D, E, F]");
		list.addAll(list2);
		System.out.println(list);

		System.out.println("~~~ foreach list");
		System.out.println("~~~ Result: D E F ");
		for (Object el : list) {
			System.out.print(el + " ");
		}
		System.out.println();
	}

}
