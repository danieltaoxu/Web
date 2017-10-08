package com.cookietracker.common.database

import java.util.concurrent.TimeUnit

import com.cookietracker.common.data.HostRelationDAO

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object tryDatabase extends App {
  HostRelationDAO.getAll()
  //Await.result(, Duration(10, TimeUnit.SECONDS))
}
