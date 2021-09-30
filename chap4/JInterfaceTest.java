package chap4;

/**   
 *   
 * @author Â½¼Ñì¿  
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
