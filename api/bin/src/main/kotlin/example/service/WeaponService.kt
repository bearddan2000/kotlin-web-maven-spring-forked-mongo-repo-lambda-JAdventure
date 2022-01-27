package example.service;

import example.model.Weapon;

/**
 * @author regcrix
 */
interface WeaponService {

    fun findAll(): List<Weapon>;

    fun findByName(name: String): Weapon;

}
