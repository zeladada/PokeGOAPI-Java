package com.pokegoapi.util;

import com.pokegoapi.util.Log.Level;

import static com.pokegoapi.util.Log.Level.*;

/**
 * Created by Will on 7/20/16.
 */
public abstract class BaseLogger implements Logger {

	@Override
	public void v(String tag, String msg) {
		log(VERBOSE, tag, msg, null);
	}

	@Override
	public void v(String tag, String msg, Throwable t) {
		log(VERBOSE, tag, msg, t);
	}

	@Override
	public void d(String tag, String msg) {
		log(DEBUG, tag, msg, null);
	}

	@Override
	public void d(String tag, String msg, Throwable tr) {
		log(DEBUG, tag, msg, tr);
	}

	@Override
	public void i(String tag, String msg) {
		log(INFO, tag, msg, null);
	}

	@Override
	public void i(String tag, String msg, Throwable tr) {
		log(INFO, tag, msg, tr);
	}

	@Override
	public void w(String tag, String msg) {
		log(WARN, tag, msg, null);
	}

	@Override
	public void w(String tag, String msg, Throwable tr) {
		log(WARN, tag, msg, tr);
	}

	@Override
	public void w(String tag, Throwable tr) {
		log(WARN, tag, null, tr);
	}

	@Override
	public void e(String tag, String msg) {
		log(ERROR, tag, msg, null);
	}

	@Override
	public void e(String tag, String msg, Throwable tr) {
		log(ERROR, tag, msg, tr);
	}

	@Override
	public void wtf(String tag, String msg) {
		log(ASSERT, tag, msg, null);
	}

	@Override
	public void wtf(String tag, Throwable tr) {
		log(ASSERT, tag, null, tr);
	}

	@Override
	public void wtf(String tag, String msg, Throwable tr) {
		log(ASSERT, tag, msg, tr);
	}

	public abstract void log(Level level, String tag, String msg, Throwable tr);
}
