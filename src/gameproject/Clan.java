package gameproject;

import java.util.ArrayList;

public class Clan {
private String jabatan, nama_cln;
int level;
private int jml_member;
 
public Clan(String nm_cln, int level, int jml_member) {
    setNama(nm_cln);
    setLevel(level);
    setJmlMbr(jml_member);
}
 private void setNama(String nama_cln) {
    this.nama_cln=nama_cln;
    }
 private void setLevel(int level) {
    this.level=level;
    }
 private void setJmlMbr(int jml_member) {
    this.jml_member=jml_member;
    }

   
}
