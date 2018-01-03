package syifafauziah.crudpegawai;

/**
 * Created by Administrator on 11/23/2017.
 */

public class  Konfigurasi {
    public static final String URL_ADD="http://192.100.100.225/pegawai/tambahPgw.php";
    public static final String URL_GET_ALL = "http://192.100.100.225/pegawai/tampilsemuaPgw.php";
    public static final String URL_GET_EMP = "http://192.100.100.225/pegawai/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.100.100.225/pegawai/updatePgw.php";
    public static final String URL_DELETE_EMP = "http://192.100.100.225/pegawai/hapusPgw.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_KELAS = "grade"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_NO_HP = "no_hp";
    public static final String KEY_EMP_ALAMAt = "address";
    public static final String KEY_EMP_CITA_CITA = "idea";//salary itu variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_KELAS = "grade";
    public static final String TAG_NO_HP = "no_hp";
    public static final String TAG_ALAMAT = "address";
    public static final String TAG_CITA_CITA = "idea";


    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
