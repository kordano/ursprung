(ns ursprung.rest
  (:require [org.httpkit.server :refer [run-server]]
            [compojure.route :refer [resources not-found]]
            [compojure.core :refer [defroutes]]))


(defroutes base-routes
  (resources "/")
  (not-found "<h1>404. Page not found.</h1>"))

