package com.nrm.GLEngine3D.GameObject;

import org.lwjgl.util.vector.Vector3f;

import com.nrm.GLEngine3D.Collision.Collision;

public class GameObject {
	public Vector3f position;
	public Vector3f size;
	public Vector3f rotation;
	
	public GameObject(Vector3f pos,Vector3f rot,Vector3f s){
		this.position = pos;
		this.rotation = rot;
		this.size = s;
	}
	public GameObject(Vector3f pos,Vector3f rot){
		this.position = pos;
		this.rotation = rot;
	}
	public GameObject() {
		this.position = new Vector3f();
		this.size = new Vector3f();
		this.rotation = new Vector3f();
	}
	public boolean hasCollision(){
		return false;
	}
	public void update() {

	}

	public void render() {

	}

}
