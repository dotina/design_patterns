package org.example.chain_of_responsibility_pattern;

import org.example.chain_of_responsibility_pattern.documents.DocumentHandler;
import org.example.chain_of_responsibility_pattern.documents.SlideShowHandler;
import org.example.chain_of_responsibility_pattern.documents.SpreadSheetHandler;
import org.example.chain_of_responsibility_pattern.documents.TextDocumentHandler;

public class ClientApp {
    public static void main(String[] args) {
        // the chain of handlers passed
        DocumentHandler chain = new SpreadSheetHandler(new SlideShowHandler(new TextDocumentHandler(null)));

        chain.openDocument("txt");
    }
}
