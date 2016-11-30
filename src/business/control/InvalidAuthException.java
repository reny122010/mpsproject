/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

/**
 *
 * @author Ruan
 */
public class InvalidAuthException extends Exception{
		
    public InvalidAuthException(String msg){
        super(msg);
    }
}
