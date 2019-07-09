package com.panda.product.core.effectiveJava;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 测试Java的序列化
 * @author likaisheng
 *
 */
public abstract class AbstractFoo{
	private int x , y;
	private enum State {NEW, INITIALIZING, INITIALIZED };
	private final AtomicReference<State> init = new AtomicReference<State>(State.NEW);
	
	public AbstractFoo(int x, int y){
		initialize(x, y);
	}
	public AbstractFoo() {
		
	}
	
	protected final void initialize(int x, int y){
		if (!init.compareAndSet(State.NEW, State.INITIALIZING)) {
			throw new IllegalStateException("Already initialized");
		}
		this.x = x;
		this.y = y;

		init.set(State.INITIALIZED);
	}
	
	public AtomicReference<State> getInit() {
		return init;
	}

	private void checkInit(){
		if (init.get() != State.INITIALIZED) {
			throw new IllegalStateException("Uninitialized");
		}
	}
	
	public final int getX() {
		checkInit();
		return x;
	}

	public final int getY() {
		checkInit();
		return y;
	}

}
