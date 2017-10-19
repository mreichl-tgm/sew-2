/*
 * 
 * @author re1
 * @date 17.12
 * 
 * Can sort a randomly generated or user generated numeral Array with 3 different Methods and find numeral inputs.
 *
 */

import javax.swing.JOptionPane;

public class sortandfind {
	public static void main (String[] args) {
		int[] base = new int[0];
		int s1 = 0,
		 	s2 = 0,
		 	s3 = 0;
		
		boolean nextArray = true,
				useUsersArray = usersArray();
		
		while (true) {
			if (nextArray || useUsersArray) {	
				if (useUsersArray) {
					// Uses inputs to generate an Array
					if(nextArray && useUsersArray) {
					     String values = usersArrayValues();
					     s1 = Integer.parseInt(values.substring(0, values.indexOf(',')));
					     s2 = Integer.parseInt(values.substring(values.indexOf(',') + 1, values.lastIndexOf(',')));
					     s3 = Integer.parseInt(values.substring(values.lastIndexOf(',') + 1, values.length()));
					
					     int[] ary = new int[s1];
					     for (int i = 0; i < ary.length; i++) ary[i] = ownArray(ary, s2, s3)[i];
					     base = ary;
					}
				} else {
					// Uses random to generate an Array
					int[] ary = new int[(int)(Math.random()*(10-1)+1)];
					for (int i = 0; i < ary.length; i++) ary[i] = randArray(ary)[i];
					base = ary;
				}
				for (int i = 0; i < base.length; i++) System.out.print(base[i] + " ");
			}
			
			// Generates Backup for your Array so it can't get lost.
			int[] backup = new int[base.length];
		    for (int i = 0; i < base.length; i++) backup[i] = base[i];
		    
		    chooseOption(base);
		    base = backup;
		    
		    // Asks for permission to continue
		    if (JOptionPane.showConfirmDialog(null,
		        "Keep array?",
		        "Message",
	            JOptionPane.YES_NO_OPTION) == 1) {
		    	if (JOptionPane.showConfirmDialog(null,
					"Want a new one?",
					"Message",
				    JOptionPane.YES_NO_OPTION) == 1) {
					JOptionPane.showMessageDialog(null, "Bye!");
					return;
			    } else {
			    	useUsersArray = usersArray();
			    }
		    } else {
		    	nextArray = false;
		    }
		}
	}

/* Array Department */
	// Asks for Array type
	public static boolean usersArray() {
		int userArray = JOptionPane.showConfirmDialog(null,
				"Do you want your own Array?",
				"Message",
				JOptionPane.YES_NO_OPTION);
		if(userArray == 0) return true;
		return false;
	}
	
	// Gets values for user Array
	public static String usersArrayValues() {
		String values = "";
		int ary[] = new int[3];
		boolean pass = false;
			
		while (!pass) {
			try {
				ary[0] = Integer.parseInt(JOptionPane.showInputDialog(null,
										  "How long should your Array be?",
										  "Message"));						
				ary[1] = Integer.parseInt(JOptionPane.showInputDialog(null,
										  "Whats the highest number in your Array?",
										  "Message"));						
				ary[2] = Integer.parseInt(JOptionPane.showInputDialog(null,
									  	  "Whats the smallest number in your Array?",
										  "Message"));
					
				pass = true;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Only numbers allowed!");
			}
		}
		values = ary[0] + "," + ary[1] + "," + ary[2];
		return values;
	}
	
	// Generates a random Array
	public static int[] randArray(int[] value) {
	       for (int i = 0; i < value.length; i++) {
	           value[i] = (int)(Math.random()*(100-1)+1);
	       }
	       return value;
	}
		
	// Generates a user Array
	public static int[] ownArray(int[] value, int s2, int s3) {
		for (int i = 0; i < value.length; i++) {
	       value[i] = (int)(Math.random()*((s2 - s3 + 1) + s3));
	    }
	    return value;
	}

/* Social Department */
	public static void chooseOption(int[] base) {
		Object[] options={"Sort", "Find"};
        int choose = JOptionPane.showOptionDialog (null,
                                              	  "Choose your option:",
                                              	  "Message",
                                              	  JOptionPane.DEFAULT_OPTION,
                                              	  JOptionPane.QUESTION_MESSAGE,
                                              	  null,
                                              	  options, options[0]);
        
        switch(choose) { 
                 case 0 : chooseSorter(base);
                 		  break;
                 case 1 : boolean pass = false; 
        	 	 		  do { 
		         	 	      try {
		         	 	          logSearching(chooseFinder(base), base, Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number", "Message")));
		         	 	          pass = true;
		         	 	      } catch (Exception e) {
		         	 	          JOptionPane.showMessageDialog(null, "Only numbers allowed!");
		         	 	      }
		          		  } while (!pass);
		         	 	  break;
                 default: System.out.println("You shouldn't have get here.");
        }
	}
	
	// Chooses your sorting Method
	public static void chooseSorter(int[] base) {
        Object[] options={"Bubble", "Selective", "Count", "Bubble 2"};
        long startTime;
        int choose = JOptionPane.showOptionDialog (null,
                                              	  "Choose a sorting method:",
                                              	  "Message",
                                              	  JOptionPane.DEFAULT_OPTION,
                                              	  JOptionPane.QUESTION_MESSAGE,
                                              	  null,
                                              	  options, options[0]);
        
        switch(choose) { 
                 case 0 : startTime = System.nanoTime();
                	 	  logSorting(bubSort(base));
                 		  System.out.println((System.nanoTime() - startTime) + "ns\n");
                 		  break;
                 case 1 : startTime = System.nanoTime();
                 		  System.out.println((System.nanoTime() - startTime) + "ns\n");
                	 	  logSorting(selSort(base));
                 		  break;
                 case 2 : startTime = System.nanoTime();
                	 	  logSorting(inpSort(base));
                	 	  System.out.println((System.nanoTime() - startTime) + "ns\n");
                 		  break;
                 case 3 : startTime = System.nanoTime();
                	 	  logSorting(bubSortTwo(base));
                	 	  System.out.println((System.nanoTime() - startTime) + "ns\n");
                 		  break;
                 default: System.out.println("You shouldn't have get here.");
        }
    }
	
/* Sorting Department */	
	// Bubble sorting
	public static int[] bubSort(int[] ary) {
        int[] backup = new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
            backup[i] = ary[i];
        }        
        boolean switched;
        
        do {
            switched = false;
            for (int i = 0; i < ary.length - 1; i++) {
                if (ary[i] > ary[i + 1]) {
                    ary[i] = ary[i + 1];
                    ary[i + 1] = backup[i];
                    backup[i] = ary[i];
                    backup[i + 1] = ary[i + 1];
                    
                    switched = true;
                }
            }
        } while (switched);
        return ary;
    }
    
    // Input sorting
    public static int[] inpSort(int[] ary) {
       	int[] backup = new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
            backup[i] = ary[i];
        }
        
    	for(int i = 0; i < ary.length - 1; i++) {    		
    		if(ary[i] > ary[i + 1]) {
    			ary[i + 1] = ary[i];
    			ary[i + 1] = backup[i];
    			backup[i] = ary[i];
    		}
    	}
    	return ary;
    }
    
    // Selective sorting
    public static int[] selSort(int[] ary) {        
        int end = ary[0];
    	for(int i = 0; i < ary.length; i++) {
       		if(ary[i] > end) {
       			end = ary[i];
    	    }
    	}
       	for (int j = 0; j < ary.length; j++) {
      		if(end < ary[j]) {
    			ary[j] = end;
       		}
       	}	
    	return ary;
    }
    
    // Bubble sorting 2
	public static int[] bubSortTwo(int[] ary) {
        int[] backup = new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
            backup[i] = ary[i];
        }        
        boolean switched;
        
        do {
            switched = false;
            for (int i = 0; i < ary.length - 1; i++) {
                if (ary[i] > ary[i + 1]) {
                    ary[i] = ary[i + 1];
                    ary[i + 1] = backup[i];
                    backup[i] = ary[i];
                    backup[i + 1] = ary[i + 1];
                    switched = true;
                }
                
                if (ary[i] > ary[ary.length - 1]) {
                    ary[i] = ary[ary.length - 1];
                    ary[ary.length - 1] = backup[i];
                    backup[i] = ary[i];
                    backup[ary.length - 1] = ary[ary.length - 1];    
                    switched = true;
                }
            }
        } while (switched);
        return ary;
    }
    
    // Logs your sorting method
 	public static void logSorting(int[] ary) {
         System.out.println("\nSorted to");
         for (int i = 0; i < ary.length; i++) {
             System.out.print(ary[i] + " ");
         }
         System.out.print("after ");
 	}
   
/* Searching Department */ 	
 	// Chooses your searching Method
 	public static int chooseFinder(int[] base) {
 		Object[] options={"Binary", "Counting"};
        int choose = JOptionPane.showOptionDialog (null,
                                              	  "Choose a sorting method:",
                                              	  "Message",
                                              	  JOptionPane.DEFAULT_OPTION,
                                              	  JOptionPane.QUESTION_MESSAGE,
                                              	  null,
                                              	  options, options[0]);
        
        switch(choose) { 
                 case 0: return 0;
                 case 1: return 1;
        }
        return 0;
 	}

 	// Logs and executes a searching method for user
    public static void logSearching(int method, int[] base, int number) {
    	long startTime = 0;
    	int index = 0;
    	
    	switch (method) {
    		case 0 : startTime = System.nanoTime();
    				 index = searchBin(base, number);
    				 break;
    		case 1 : startTime = System.nanoTime();
    				 index = searchAdd(base, number);
					 break;
			default: index = 0;
					 break;
    	}
    	
    	System.out.println("Found it at Index " + index + " after " + (System.nanoTime() - startTime) + " ns\n");
    	if(index > -1) {
    		JOptionPane.showMessageDialog(null, "Found it at Index " + index + " after " + (System.nanoTime() - startTime) + " ns");
    	} else {
    		JOptionPane.showMessageDialog(null, "Found out its not there after " + (System.nanoTime() - startTime) + " ns");
    	}
    }
 	
    // Searches by Binary Algorithm 
    public static int searchBin(int[] base, int number) {
        int mid,
        	left = 0,
        	right = base.length - 1;
   
        while (left <= right)   
        {
            mid = left + ((right - left) / 2);
     
            if (base[mid] == number) {
                return mid;
            } else {
                if (base[mid] > number) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
    	return -1;
    }
    
    // Searches by Counting
    public static int searchAdd(int[] base, int number) {
    	for (int i = 0; i < base.length; i++) {
    		if (base[i] == number) return i;
    	}
    	return -1;
    }
}