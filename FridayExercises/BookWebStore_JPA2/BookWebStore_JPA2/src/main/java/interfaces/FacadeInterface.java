/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Ebook;
import entity.PaperBook;
import java.util.List;

/**
 *
 * @author Menja
 */
public interface FacadeInterface {

    //Ebooks
    public Ebook createEbook(Ebook ebook);

    public Ebook readBook(int id);

    public Ebook updateBook(Ebook ebook);

    public Ebook deleteBook(int id);

    public List<Ebook> getEbooks();

    //PaperBooks
    public PaperBook createPaperbook(PaperBook paperBook);

    public PaperBook readPaperBook(int id);

    public PaperBook updatePaperBook(PaperBook paperBook);

    public PaperBook deletePaperBook(int id);

    public List<PaperBook> getPaperBook();
}
