package Absrtact;

import java.security.Security;

public interface Laptop {
void capy();
void paste();
void cut();
void keyboard();

// After java 8 version they should implement these concept
default void Security() {
	System.out.println("implement");
}

static void audio() {
	System.out.println("audio implement");
	System.out.println("audio ");
	System.out.println("audio 233implement");
}

}
