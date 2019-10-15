/* HEADER
 * Program Name: Data Twirl
 * Author: Chris Ellson (actually Mr. Burke)
 * Class: CS260 Fall 2019
 * Date: 10/15/2019
 * Description: This program creates a 2D image of a triangle and
 * a wine glass and then rotates it 90 degrees clockwise 3 times,
 * printing each iteration to the console.
 */
package cs260_wk4_DataTwirl;

public class MainEntry {
	
	
	public static void main(String[] args) {
		//create and fill 2D array to print image
		TwoDArray arr = new TwoDArray();
		//print original array
		arr.printArray();
		System.out.println();
		//print array rotated 90 degrees
		arr.printArray90();
		System.out.println();
		//print array rotated 180 degrees
		arr.printArray180();
		System.out.println();
		//print array rotated 270 degrees
		arr.printArray270();

	}

}

/* FOOTER
*       ********
**       ****** 
***       ****  
****       **   
*****      **   
******     **   
*******    **   
********  ****  

********
******* 
******  
*****   
****    
***     
**      
*       
       *
      **
*    ***
********
********
*    ***
      **
       *

  ****  ********
   **    *******
   **     ******
   **      *****
   **       ****
  ****       ***
 ******       **
********       *

*       
**      
***    *
********
********
***    *
**      
*       
       *
      **
     ***
    ****
   *****
  ******
 *******
********

*/