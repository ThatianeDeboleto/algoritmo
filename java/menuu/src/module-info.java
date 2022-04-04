package com.menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class main {
    private static final String INVALID_OPTION = "*** Invalid Option ***";
    private List<MenuItem> itens;
	private String title;
	private String prompt;
    
    /**
     * 
     * @param maxItens
     */
    public Menu(int maxItens) {
        itens = new ArrayList<>(maxItens);
        for(int i = 0; i < maxItens; i++) {
            itens.add(null);
        }
    }
    
    /**
     * 
     * @param index
     * @param item
     */
    public void addItem(int index, MenuItem item) {
        itens.add(index, item.setOption(index));
    }
    
    /**
     * 
     * @param index
     * @param label
     * @param action
     */
    public void addItem(int index, String label, Action action) {
        itens.add(index, new MenuItem(index, label, action));
    }
    
    /**
     * 
     */
    public void run() {
        int option = drawAndGet();
        
        try {
            MenuItem item = itens.get(option);
            if( item != null) {
                item.run();
            } else {
                System.out.println(INVALID_OPTION);
                run();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(INVALID_OPTION);
            run();
        }
        
    }

    public void setTitle(String title) {
    	this.title = title;
    }
    
    public void setPrompt(String prompt) {
    	this.prompt = prompt;
    }
    
    public void clearScreen() {
    	// Jump to the end of the console
    	System.out.print("\u001b[2J"); 
    	
    	// Position cursor to position 0,0 (upper left)
    	System.out.print("\u001b[0;0H");
    	System.out.flush();
    }

    
    
    /**
     * 
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(MenuItem item : itens) {
            if(item != null) {
                builder.append(item.toString()).append("\n");
            }
        }
        
        return builder.toString();
    }
   
    
   
    
    /**
     * 
     * @return
     */
    private Integer drawAndGet() {
        String option = null;
        try {
            draw();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            option = br.readLine();
        } catch(Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            return null;
        }
        
        return Integer.parseInt(option);
    }
    
    /**
     * 
     */
    private void draw() {
    	clearScreen();
    	banner();
        System.out.println(this);
        if(prompt != null) {
        	System.out.print(prompt);
        }
        else {
        	System.out.print("Option: ");
        }
    }
    
    
    private void banner() {
    	if(title != null) {
	    	StringBuilder builder = new StringBuilder();
	    	for(int i = 0; i < 79; i++)
	    		builder.append("*");
	    	
	    	builder.append("\n");
	    	builder.append("*");
	    	builder.append(padRight(padLeft(title, 38), 77));
	    	builder.append("*");
	    	builder.append("\n");
	    	
	    	for(int i = 0; i < 79; i++)
	    		builder.append("*");
	    	
	    	builder.append("\n");
	    	
	    	System.out.println(builder.toString());
    	}
    }
    
   private String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);  
   }

   private String padLeft(String s, int n) {
       return String.format("%1$" + n + "s", s);  
   }
}