package edu.rafialwi.assesmentbelajarandroidform

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.rafialwi.assesmentbelajarandroidform.databinding.ActivityMainBinding
import edu.rafialwi.assesmentbelajarandroidform.model.Participant

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val semester1 = listOf("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII")
    private val device1 = listOf("PC Desktop", "Laptop", "Tidak Punya")
    private val osDevice1 = listOf("Windows", "MacOS", "Linux")
    private val deployment1 = listOf("Emulator", "Device Kabel", "Device Wifi", "Tidak Bisa Deploy")
    private val merkHP1 = listOf("Samsung", "Xiaomi", "Asus", "Lenovo", "Oppo", "Vivo", "Realme", "Sony", "Huawei", "Apple", "Lainnya")
    private val internet1 = listOf("Tethering Hp Sendiri", "Wifi Sendiri", "Wifi Nebeng", "Tidak Punya")
    private val android1 = listOf("Sudah", "Belum", "Tidak Bisa")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Adapter Spinner
        val semsAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, semester1)
        semsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spSemester.adapter = semsAdapter

        val devAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, device1)
        devAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spDevice.adapter = devAdapter

        val osAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, osDevice1)
        osAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spOSDevice.adapter = osAdapter

        val depAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, deployment1)
        depAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spDeployment.adapter = depAdapter

        val merkAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, merkHP1)
        merkAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spMerkHP.adapter = merkAdapter

        val intAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, internet1)
        intAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spInternet.adapter = intAdapter

        val andAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, android1)
        andAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spAndroid.adapter = andAdapter

        binding.btnSubmit.setOnClickListener {

            val nim = binding.edtNim.text.toString()
            val nama = binding.edtNama.text.toString()
            val semester2 = binding.spSemester.selectedItem.toString()
            val device2 = binding.spDevice.selectedItem.toString()
            val osDevice2 = binding.spOSDevice.selectedItem.toString()
            val namaOSBit = binding.edtNamaOSBit.text.toString()
            val ram = binding.edtRam.text.toString()
            val namaCPU = binding.edtNamaCPU.text.toString()
            val deployment2 = binding.spDeployment.selectedItem.toString()
            val merkHP2 = binding.spMerkHP.selectedItem.toString()
            val osHPVersi = binding.edtOSHPVersi.text.toString()
            val sizeHP = binding.edtSizeHP.text.toString()
            val internet2 = binding.spInternet.selectedItem.toString()
            val android2 = binding.spAndroid.selectedItem.toString()
            val versiAndroid = binding.edtVersiAndroid.text.toString()

            if (nim.isEmpty() || nama.isEmpty() || namaOSBit.isEmpty() || ram.isEmpty() || namaCPU.isEmpty() || osHPVersi.isEmpty() || sizeHP.isEmpty() || versiAndroid.isEmpty()) {
                Toast.makeText(this, "Semua Field Harus Diisi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val participant = Participant(nim, nama, semester2, device2, osDevice2, namaOSBit, ram, namaCPU, deployment2, merkHP2, osHPVersi, sizeHP, internet2, android2, versiAndroid)
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("participant", participant)
            startActivity(intent)
        }

    }
}