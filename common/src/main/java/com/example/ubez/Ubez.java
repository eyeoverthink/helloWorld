package com.example.ubez;

import static com.codename1.ui.CN.*;
import com.codename1.system.Lifecycle;
import com.codename1.ui.*;
import com.codename1.ui.layouts.*;
import com.codename1.io.*;
import com.codename1.ui.plaf.*;
import com.codename1.ui.util.Resources;

/**
 * This is my first attempt
 * of building native mobile applications using Java.
 */
public class Ubez extends Lifecycle {
    @Override
    public void runApp() {
        Form hi = new Form("Hi World", BoxLayout.y());
        Button helloButton = new Button("Hello World");
        hi.add(helloButton);
        helloButton.addActionListener(e -> hello());
        hi.getToolbar().addMaterialCommandToSideMenu("Hello Command",
        FontImage.MATERIAL_CHECK, 4, e -> hello());
        hi.show();
    }

    private void hello() {
        Dialog.show("Hello World", "Welcome to my Application", "OK", null);
    }

}
