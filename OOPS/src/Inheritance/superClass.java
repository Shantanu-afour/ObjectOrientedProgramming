package Inheritance;

class superClass {
	int i, j;

	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class subClass extends superClass {
	int k;

	void showk() {
		System.out.println("k:" + k);
	}

	void sum() {
		System.out.println(i + j + k);
	}

}

