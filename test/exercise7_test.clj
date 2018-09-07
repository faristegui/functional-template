(ns exercise7-test
  (:require [clojure.test :refer :all]
            [exercise7 :refer :all]))

(deftest enesimo-elemento-vector-numerico
  (testing "Devuelve el enesimo elemento numérico."
    (is (= (enesimo 3 [1 2 3 4 5]) 4))))

(deftest enesimo-elemento-vector-string
  (testing "Devuelve el enesimo elemento de un vector de string."
    (is (= (enesimo 0 ["FIUBA" "TDD" "7510"]) "FIUBA"))))

(deftest enesimo-lista-strings
  (testing "Devuelve enesimo elemento de una lista de strings"
    (is (= (enesimo 1 '("fiuba" "tdd" "tecnicas" "7510")) "tdd"))))

(deftest enesimo-lista-numeros
  (testing "Devuelve enesimo elemento de una lista numerica."
	(is (= (enesimo 4 '(1 2 3 4 5 10 22)) 5))))