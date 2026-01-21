package com.sushank.dsa.designpatterns;

interface Glyph {
    void draw();
}

abstract class MonoGlyph implements Glyph { }

abstract class GlyphDecorator extends MonoGlyph {
    protected Glyph glyph;

    public GlyphDecorator (Glyph glyph) {
        this.glyph = glyph;
    }

    @Override
    public void draw() {
        glyph.draw();
    }
}

class CharacterGlyph extends MonoGlyph {
    private final String text;

    public CharacterGlyph(String text) {
        this.text = text;
    }

    @Override
    public void draw() {
        System.out.print("Drawing text: " + text);
    }
}

class BorderDecorator extends GlyphDecorator {
    public BorderDecorator(Glyph innerGlyph) {
        super(innerGlyph);
    }

    @Override
    public void draw() {
        System.out.print("[Border]");
        super.draw();
        System.out.print("[/Border]");
    }
}

class ScrollDecorator extends GlyphDecorator {
    public ScrollDecorator(Glyph innerGlyph) {
        super(innerGlyph);
    }

    @Override
    public void draw() {
        System.out.println("Adding scroll functionality");
        super.draw();
    }
}

public class Decorator {
    public static void main(String[] args) {

        Glyph character = new CharacterGlyph("Hello, World!");
        Glyph borderedCharacter = new BorderDecorator(character);
        Glyph scrollableBorderedCharacter = new ScrollDecorator(borderedCharacter);

        scrollableBorderedCharacter.draw();
    }
}

