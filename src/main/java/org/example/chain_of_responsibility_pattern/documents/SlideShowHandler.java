package org.example.chain_of_responsibility_pattern.documents;

public class SlideShowHandler extends DocumentHandler{
    public SlideShowHandler(DocumentHandler next) {
        super(next);
    }
    @Override
    public void openDocument(String fileExtension) {
        if (!fileExtension.equalsIgnoreCase("ppt")) {
            super.openDocument(fileExtension);
            return;
        }
        System.out.println("Opening slideshow document");
    }
}
