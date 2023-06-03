/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author mta
 */
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;


public class CharacterOnlyFilter extends DocumentFilter {
    
    private final String pattern = "[a-zA-Z ]";

    @Override
    public void insertString(FilterBypass fb, int offset, String text, AttributeSet attrs) throws BadLocationException {
        StringBuilder sb = new StringBuilder(text);
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (!String.valueOf(sb.charAt(i)).matches(pattern)) {
                sb.deleteCharAt(i);
            }
        }
        super.insertString(fb, offset, sb.toString(), attrs);
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        StringBuilder sb = new StringBuilder(text);
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (!String.valueOf(sb.charAt(i)).matches(pattern)) {
                sb.deleteCharAt(i);
            }
        }
        super.replace(fb, offset, length, sb.toString(), attrs);
    }
}

