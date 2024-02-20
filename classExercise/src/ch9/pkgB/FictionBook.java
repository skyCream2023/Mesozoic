package ch9.pkgB;

import ch9.pkgA.Book;

class FictionBook extends Book{
	public void doTHings() {
		read();
		this.read();
		FictionBook fb = new FictionBook();
		fb.read();
		Book b = new Book();
		b.read();
	}
}

class SpaceFictionBook extends FictionBook{
	public void doThings() {
		read();
		new Book().read();
		new FictionBook().read();
		new SpaceFictionBook().read();
	}
}

class Reader {
	public void doThings() {
		Book b = new Book();
		b.read();
		
		FictionBook fb = new FictionBook();
		fb.read();
	}
}



