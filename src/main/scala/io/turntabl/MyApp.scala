package io.turntabl

import io.turntabl.students.TLCStudent

object MyApp extends App {
   val s = new TLCStudent("Yaa", "Nuamah")
   val u = new TLCStudent("Doreen", "Dodoo", 255, "DevOps",2013)
   println(s.calculateTermOfService())

   println(s sameTermOfService u)

   val companionObject = TLCStudent("Akwesi", "Kusi", 267, "Product Manager", 2014,"https://github.com/turntabl")
   //println(companionObject)

   println(s.TopGrade)
}
