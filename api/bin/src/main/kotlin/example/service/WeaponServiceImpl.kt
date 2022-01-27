package example.service;

import example.model.Weapon;
import example.repository.WeaponRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ragcrix
 */
@Service
class WeaponServiceImpl : WeaponService {

  @Autowired
  lateinit var weaponRepository: WeaponRepository

  override fun findAll(): List<Weapon> = weaponRepository.findAll()

  override fun findByName(name: String): Weapon {
   val lst = weaponRepository.findAll()
    val res = lst.filter(){ it.name == name }
    res?.let {return res.get(0)}
    ?: run {return Weapon()}
  }

}
