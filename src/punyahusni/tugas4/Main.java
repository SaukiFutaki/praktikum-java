package punyahusni.tugas4;

import javax.swing.JOptionPane;

public class Main extends CD {
    public static void main (String[]args){
            Main x = new Main ();
            String judul, pemain ,sutradara,produser,kategori,stock,penyanyi,publisher,tophits;
        
            judul = JOptionPane.showInputDialog("judul cd:");
            x.judul(judul);
            x.tampil("judul cd :" + x.getjudul());
        
            stock = JOptionPane.showInputDialog("stock cd :");
            x.stock(stock);
            x.tampil("stock cd :"+ x.getstock());
        
            kategori=JOptionPane.showInputDialog("kategori cd: ");
            x.kategori(kategori);
            x.tampil(" kategori cd :" + x.getkategori());
            
            sutradara=JOptionPane.showInputDialog("sutradara cd: ");
            x.sutradara(sutradara);
            x.tampil("sutradara cd :" + x.getsutradara());
        
            produser=JOptionPane.showInputDialog("produser cd: ");
            x.produser(produser);
            x.tampil("produser cd :" + x.getproduser());
            
            pemain=JOptionPane.showInputDialog("pemain cd: ");
            x.pemain(pemain);
            x.tampil("pemain cd :" + x.getpemain());
            
            penyanyi=JOptionPane.showInputDialog("penyanyi cd: ");
            x.penyanyi(penyanyi);
            x.tampil(" penyanyi cd :" + x.getpenyanyi());
            
            publisher=JOptionPane.showInputDialog("publisher cd: ");
            x.publisher(publisher);
            x.tampil("publisher cd :" + x.getpublisher());
            
            tophits=JOptionPane.showInputDialog("tophits cd: ");
            x.tophits(tophits);
            x.tampil("tophits cd :" + x.gettophits());

            
            x.hapus();
            judul = null;
            stock = null;
            kategori = null;
            sutradara = null; 
            produser = null;
            pemain = null;
            penyanyi=null;
            publisher=null;
            tophits=null;
            x=null;
            System.exit(0);
        }

      }