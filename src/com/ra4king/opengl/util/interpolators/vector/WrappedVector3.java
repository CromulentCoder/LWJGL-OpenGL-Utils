package com.ra4king.opengl.util.interpolators.vector;

import java.nio.FloatBuffer;

import com.ra4king.opengl.util.math.Vector3;

import net.indiespot.struct.cp.Struct;
import net.indiespot.struct.cp.TakeStruct;

/**
 * @author Roi Atalla
 */
public class WrappedVector3 implements IVector<WrappedVector3,Vector3> {
	private Vector3 vec;
	
	public WrappedVector3() {
		vec = Struct.malloc(Vector3.class).set(0);
	}
	
	public WrappedVector3(WrappedVector3 wv) {
		this();
		set(wv);
	}
	
	public WrappedVector3(Vector3 v) {
		this();
		set(v);
	}
	
	@Override
	@TakeStruct
	public Vector3 getVec() {
		return vec;
	}
	
	@Override
	public WrappedVector3 copy() {
		return new WrappedVector3(this);
	}
	
	@Override
	protected void finalize() throws Throwable {
		try {
			Struct.free(vec);
		} finally {
			super.finalize();
		}
	}
	
	@Override
	public WrappedVector3 set(WrappedVector3 wv) {
		vec.set(wv.vec);
		return this;
	}
	
	@Override
	public WrappedVector3 set(Vector3 v) {
		vec.set(v);
		return this;
	}
	
	@Override
	public WrappedVector3 set(float f) {
		vec.set(f);
		return this;
	}
	
	@Override
	public WrappedVector3 add(WrappedVector3 wv) {
		vec.add(wv.vec);
		return this;
	}
	
	@Override
	public WrappedVector3 add(Vector3 v) {
		vec.add(v);
		return this;
	}
	
	@Override
	public WrappedVector3 sub(WrappedVector3 wv) {
		vec.sub(wv.vec);
		return this;
	}
	
	@Override
	public WrappedVector3 sub(Vector3 v) {
		vec.sub(v);
		return this;
	}
	
	@Override
	public WrappedVector3 mult(WrappedVector3 wv) {
		vec.mult(wv.vec);
		return this;
	}
	
	@Override
	public WrappedVector3 mult(Vector3 v) {
		vec.mult(v);
		return this;
	}
	
	@Override
	public WrappedVector3 mult(float f) {
		vec.mult(f);
		return this;
	}
	
	@Override
	public WrappedVector3 divide(WrappedVector3 wv) {
		vec.divide(wv.vec);
		return this;
	}
	
	@Override
	public WrappedVector3 divide(Vector3 v) {
		vec.divide(v);
		return this;
	}
	
	@Override
	public WrappedVector3 divide(float f) {
		vec.divide(f);
		return this;
	}
	
	@Override
	public WrappedVector3 mod(float f) {
		vec.mod(f);
		return this;
	}
	
	@Override
	public float length() {
		return vec.length();
	}
	
	@Override
	public float lengthSquared() {
		return vec.lengthSquared();
	}
	
	@Override
	public FloatBuffer toBuffer() {
		return vec.toBuffer();
	}
}
