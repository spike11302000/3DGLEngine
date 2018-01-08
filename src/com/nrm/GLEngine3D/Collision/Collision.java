package com.nrm.GLEngine3D.Collision;

import org.lwjgl.util.vector.Vector3f;

public class Collision {
	public Vector3f position;
	public Vector3f size;

	public Collision() {
		this.position = new Vector3f();
		this.size = new Vector3f();
	}

	public Collision(Vector3f pos, Vector3f s) {
		this.position = pos;
		this.size = s;
	}
	//TODO make it work for 3D.
	public boolean contains(Vector3f point) {
		return point.x >= this.position.x && point.y >= this.position.y && point.x <= (this.size.x + this.position.x)
				&& point.y <= (this.size.y + this.position.y);
	}
	//TODO make it work for 3D.
	public boolean intersects(Collision col) {
		return this.position.x < col.position.x + col.size.x && this.position.x + this.size.x > col.position.x
				&& this.position.y < col.position.y + col.size.y && this.position.y + this.size.y > col.position.y;
	}
}
