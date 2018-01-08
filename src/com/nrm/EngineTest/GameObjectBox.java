package com.nrm.EngineTest;

import java.util.Random;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;

import com.nrm.GLEngine3D.Audio.AudioSource;
import com.nrm.GLEngine3D.GameObject.GameObject;

public class GameObjectBox extends GameObject {
	private AudioSource src = new AudioSource();
	public GameObjectBox(Vector3f pos, Vector3f rot) {
		super(pos,rot);
		this.src.setBuffer(1);
		
	}
	public GameObjectBox(Vector3f pos,Vector3f rot,Vector3f s){
		this.position = pos;
		this.rotation = rot;
		this.size = s;
		this.src.setBuffer(1);
	}
	public GameObjectBox(){
		super();
		this.src.setBuffer(1);
	}
	
	public void render() {
		GL11.glPushMatrix();
		GL11.glTranslatef(this.position.x,this.position.y,this.position.z);
		GL11.glRotatef(this.rotation.x, 1, 0, 0);
		GL11.glRotatef(this.rotation.y, 0, 1, 0);
		GL11.glRotatef(this.rotation.z, 0, 0, 1);
		
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, Main.engine.textureManager.getTextureID("color"));
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glTexCoord2f(1f, 0f);
		GL11.glVertex2f(1f, 1f);
		GL11.glTexCoord2f(1f, 1f);
		GL11.glVertex2f(1f, -1f);
		GL11.glTexCoord2f(0f, 1f);
		GL11.glVertex2f(-1f, -1f);
		GL11.glTexCoord2f(0f, 0f);
		GL11.glVertex2f(-1f, 1f);
		GL11.glEnd();
		GL11.glPopMatrix();
	}
	int tick = new Random().nextInt(1000000);
	public void update(){
		tick++;
		if(tick%120==0){
			//src.play();
		}
		//this.src.setPosition(this.position);
		//this.position.x = (float) (Math.sin(tick/100.0f))*10;
		//this.position.y = (float) (Math.cos(tick/1.0f))*10;
		//this.rotation.x=tick;
	}
}
