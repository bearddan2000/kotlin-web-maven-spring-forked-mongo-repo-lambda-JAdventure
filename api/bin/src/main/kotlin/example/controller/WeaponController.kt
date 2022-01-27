package example.controller;

import example.model.Weapon;
import example.service.WeaponService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ragcrix
 */
@RestController
@RequestMapping("/weapons")
class WeaponController {

  @Autowired
  lateinit var weaponService: WeaponService

  @GetMapping("/name/{value}")
  fun getByName(@PathVariable("value") value: String): String = weaponService.findByName(value).toString()

  @GetMapping("/")
  fun getAllWeapons(): String
  {
    var sb = StringBuilder();
    for ( w in weaponService.findAll() ) {
      sb.append(w.toString()+"\n");
    }
    return sb.toString();
  }
}
