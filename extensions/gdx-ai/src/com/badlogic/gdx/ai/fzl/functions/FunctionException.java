package com.badlogic.gdx.ai.fzl.functions;


/**
 *
 * @author Valtiel
 */
public class FunctionException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1123815L;

	/**
     * Creates a new instance of <code>FunctionException</code> without detail message.
     */
    public FunctionException() {
    }

    /**
     * Constructs an instance of <code>FunctionException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public FunctionException(String msg) {
        super(msg);
    }
}