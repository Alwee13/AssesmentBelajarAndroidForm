package edu.rafialwi.assesmentbelajarandroidform

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.rafialwi.assesmentbelajarandroidform.databinding.ActivityDetailBinding
import edu.rafialwi.assesmentbelajarandroidform.model.Participant

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val participant = intent.getParcelableExtra<Participant>("participant")

        participant?.let {
            binding.txtNimResult.text = it.nim
            binding.txtNamaResult.text = it.nama
            binding.txtSemesterResult.text = it.semester
            binding.txtDeviceResult.text = it.device
            binding.txtOsdeviceResult.text = it.osDevice
            binding.txtOsbitResult.text = it.namaOSBit
            binding.txtRamResult.text = it.ram
            binding.txtCpuResult.text = it.namaCPU
            binding.txtDeployResult.text = it.deployment
            binding.txtMerkhpResult.text = it.merkHP
            binding.txtOshpversiResult.text = it.osHPVersi
            binding.txtSizehpResult.text = it.sizeHP
            binding.txtInternetResult.text = it.internet
            binding.txtInstallandroidResult.text = it.android
            binding.txtVersiandroidResult.text = it.versiAndroid
        }
    }
}