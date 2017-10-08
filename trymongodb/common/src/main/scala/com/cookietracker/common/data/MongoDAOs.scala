package com.cookietracker.common.data

import java.util.concurrent.TimeUnit

import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration
import com.cookietracker.common.database.DBComponentManager
import org.mongodb.scala.bson.collection.mutable.Document
import org.mongodb.scala.{MongoCollection, MongoDatabase, Observer}
//import com.cookietracker.common.database.ObservableHelper._


trait MongoDAOs[Type <: MongoId]{
  def insert(v: Type)

  def insert(vs: Seq[Type])

  def update(v: Type)

  def getById(id: Long)

  def getAll(): Unit

  def delete(id: Long)

}

trait HttpCookieDAO extends MongoDAOs[HttpCookieMDB] {

  override def update(v: HttpCookieMDB): Unit = ???
  override def insert(vs: Seq[HttpCookieMDB]): Unit = ???
  override def insert(v: HttpCookieMDB): Unit = ???
  override def getById(id: Long): Unit = ???
  override def getAll(): Unit = ???
  override def delete(id: Long): Unit = ???
}

object HostRelationDAO extends MongoDAOs[HostRelationMDB] {
  private val database: MongoDatabase = DBComponentManager.prepareDataBase()
  private val collection: MongoCollection[Document] = database.getCollection("HostRelation")
  override def update(v: HostRelationMDB): Unit = ???
  override def insert(vs: Seq[HostRelationMDB]): Unit = ???
  override def insert(v: HostRelationMDB): Unit = ???
  override def getById(id: Long): Unit = ???
  override def getAll(): Unit = {
    var lst : Seq[HostRelation] = Seq()
    val allValues = collection.find()
    allValues.subscribe(new Observer[Document] {
      override def onError(e: Throwable): Unit = ???

      override def onComplete(): Unit = ???
      override def onNext(result: Document): Unit = ???
    })
    val documents: Seq[Document] = Await.result(allValues.toFuture(), Duration(20, TimeUnit.SECONDS))
    documents.foreach(result => {
      println(result.get("_id").map(v => v.asObjectId().getValue).getOrElse(""))
      HostRelationMDB(result.get("fromHost").map(v => v.asString().getValue).getOrElse(""),
        result.get("toHost").map(v => v.asString().getValue).getOrElse(""),
        result.get("requestUrl").map(v => v.asString().getValue).getOrElse(""),
        result.get("_id").map(v => Some(v.asObjectId().getValue)).getOrElse(None))
    })
  }
  override def delete(id: Long): Unit = ???
}

trait UrlDAO extends MongoDAOs[UrlMDB] {
  override def update(v: UrlMDB): Unit = ???
  override def insert(vs: Seq[UrlMDB]): Unit = ???
  override def insert(v: UrlMDB): Unit = ???
  override def getById(id: Long): Unit = ???
  override def getAll(): Unit = ???
  override def delete(id: Long): Unit = ???
}