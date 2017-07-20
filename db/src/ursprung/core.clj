(ns ursprung.core
  (:require [hasch.core :refer [uuid]]
            [replikativ.peer :refer [server-peer]]
            [kabel.peer :refer [start stop]]
            [konserve.memory :refer [new-mem-store]]
            [superv.async :refer [<?? S]] ;; core.async error handling
            [clojure.core.async :refer [chan] :as async]))

(defonce server-state
  (atom {:replicae {"mail:alice@replikativ.io"
                    {#uuid "0e16b068e-aa3e-4212-af1d-4f9dd4ec9e4f"
                     {:active-peers 0
                      :created (java.util.Date.)}}}}))

(defn start-server []
  (let [uri   "ws://127.0.0.1:31778"
        store (<?? S (new-mem-store))
        peer  (<?? S (server-peer S store uri))]
    (<?? S (start peer))
    (<?? S (chan))))

(defn -main [& args]
  (start-server))
