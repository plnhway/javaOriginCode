package chap4;

/**   
 *   
 * @author ½���  
 * 
 */

interface InterfaceA
{
	
	void testA();
}

interface InterfaceB
{
	void testB();
}

abstract interface InterfaceC  extends InterfaceA,InterfaceB
{
	void testC();
}

public class JInterfaceTest
{

}
