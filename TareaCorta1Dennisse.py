#========================================================================#
# Bubble Sort y Selection sort                                           #
# Análisis de Algoritmos Gr 40                                           #
#                                                                        #
# Dennisse Rojas Casanova                                                #
# 2013001522                                                             #   
#                                                                        #                       
# Tarea Corta num.1                                                      #                   
#========================================================================#
import random
import time
#*****************************Bubble Sort *******************************#

def bubbleSort(L):
    for numero in range(len(L)-1,0,-1):
        for i in range(numero):
            if L[i]>L[i+1]:
                temp = L[i]
                L[i] = L[i+1]
                L[i+1] = temp


#*****************************Selection Sort ****************************#

def selectionSort(L):
   for numero in range(len(L)-1,0,-1):
       numeroMayor = 0
       for lugar in range(1,numero+1):
           if L[lugar]>L[numeroMayor]:
               numeroMayor = lugar

       temp = L[numero]
       L[numero] = L[numeroMayor]
       L[numeroMayor] = temp

#*******************************Main**************************************#
def main():
    listaPrueba = []
    
    largoListaPrueba = random.randint(1,20)

    for indice in range(largoListaPrueba) :
        numero = random.randint(1,100000) 
        listaPrueba.append(numero)        
   
    print("Lista a ordenar:\n")
    print(listaPrueba, "\n\n\n")
    print("======================================================================")
    print("Ordenando con el método BubbleSort\n")

    listaPruebaSelection = listaPrueba
    listaPruebaBubble = listaPrueba

    inicio = time.time()
    bubbleSort(listaPruebaBubble)
    print(listaPruebaBubble)
    fin =  time.time()
    total = fin- inicio
    print("\nTiempo de BubbleSort : ", total, "\n\n\n")
    
    print("======================================================================")
    print("Ordenando con el método SelectionSort\n")

    inicioS = time.time()
    selectionSort(listaPruebaSelection)
    print(listaPruebaSelection)
    finS =  time.time()
    totalS = finS- inicioS
    print("\nTiempo de Selection Sort : ", totalS)
  

main()
