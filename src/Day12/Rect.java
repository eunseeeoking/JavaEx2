package Day12;

public class Rect {

	int width;
	int height;

	Rect(int w, int h) {
		this.width = w;
		this.height = h;
	}

	public boolean equals(Rect obj) {
		if ((this.width * this.height) == (obj.width * obj.height)) {
			return true;

		} else
			return false;
	}
}
