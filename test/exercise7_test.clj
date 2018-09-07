(ns exercise7-test
  (:require [clojure.test :refer :all]
            [exercise7 :refer :all]))

(deftest enesimo-elemento-vector-numerico
  (testing "Devuelve el enesimo elemento numérico."
    (is (= (enesimo 1 [1 2 3 4]) 2))))

(deftest enesimo-elemento-vector-string
  (testing "Devuelve el enesimo elemento de un vector de string."
    (is (= (enesimo 0 ["FIUBA" "TDD" "7510"]) "FIUBA"))))
	
(deftest enesimo-elemento-mapa
  (testing "Devuelve el enesimo elemento de un mapa."
    (is (= (enesimo 0 [:FIUBA :TDD :7510]) :FIUBA))))

(deftest enesimo-lista-strings
  (testing "Devuelve enesimo elemento de una lista de strings"
    (is (= (enesimo 1 '("fiuba" "tdd" "tecnicas" "7510")) "tdd"))))

(deftest enesimo-lista-numeros
  (testing "Devuelve enesimo elemento de una lista numerica."
	(is (= (enesimo 2 '(4 5 6 7)) 6))))
	
	(deftest enesimo-lista-vectores
  (testing "Devuelve enesimo elemento de una lista de vectores."
	(is (= (enesimo 2 '([1 2] [3 4] [5 6])) [5 6]))))