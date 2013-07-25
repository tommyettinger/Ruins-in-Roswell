(defproject rir "0.0.1"
  :description "Text-based Dungeon Exploration Roguelike/RPG"
  :url "https://github.com/tommyettinger/Ruins-in-Roswell"
  :license {:name "MIT License"
            :url "http://mit-license.org/"}
  :plugins [[org.timmc/lein-otf "2.0.1"]]
  :dependencies [
                 [org.clojure/clojure "1.5.1"]
                 [prismatic/hiphip "0.1.0"]
                 [seesaw "1.4.1"]]
  :resource-paths ["lib/"]
 ; :jvm-opts ^:replace []
 ; :aot [dijkstra.hiphills]
  :main  ^:skip-aot rir.core
 )