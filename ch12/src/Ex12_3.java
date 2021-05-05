import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() { return "Fruit";}
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy                 { public String toString() { return "Toy"  ;}}

interface Eatable {}

class Ex12_3 {
	public static void main(String[] args) {
		FruitBox<? extends Fruit> fbox = new FruitBox<Fruit>();
		
		FruitBox<? extends Apple> abox = new FruitBox<Apple>();
		
		FruitBox<Apple> abox2 = (FruitBox<Apple>)abox;
		
	}  // main
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);     }
	T get(int i)     { return list.get(i); }
	int size()       { return list.size(); }
	public String toString() { return list.toString();}
}