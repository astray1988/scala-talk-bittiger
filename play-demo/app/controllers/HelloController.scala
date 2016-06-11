package controllers

import javax.inject.Singleton

import play.api.mvc.{Action, Controller}

/**
  * Created by dylan on 6/8/16.
  */

@Singleton
class HelloController extends Controller {

  def hello = Action(parse.json) { implicit request =>
    val result = request.body
    Ok(result.toString)
  }
}
