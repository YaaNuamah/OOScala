package io.turntabl.students

import java.time.Year

import io.turntabl.grades
import io.turntabl.grades.Grade
import javax.security.auth.Subject

class TLCStudent ( val fname: String,
                   val sname: String,
                  val id: Int = 101,
                  val role: String = "Software Developer",
                   startedyear: Int = 2013,
                  val Github_url: String = "https://github.com/turntabl") {


  override def toString = s"$fname $sname $id $role $startedyear $Github_url"

  def calculateTermOfService() = Year.now().getValue - startedyear
  def sameTermOfService(s: TLCStudent) = startedyear == startedyear
  def TopGrade = {
    Grade("OOP Programming", 98.4)
  }
}

object TLCStudent{
  def apply(fname: String, sname: String, id: Int, role: String, year: Int, Github_url: String): TLCStudent = new TLCStudent(fname, sname, id, role, year, Github_url)

}






