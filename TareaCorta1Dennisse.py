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
def main(M):
    listaPrueba = []
    
    largoListaPrueba = M

    for indice in range(largoListaPrueba) :
        numero = random.randint(1,100000) 
        listaPrueba.append(numero)        
   
    print("Parámetro M indicado (largo de la lista a ordenar): ", M)
    print("===========================================================================")
    print("Ordenando con el método BubbleSort\n")
   

    listaPruebaSelection = listaPrueba
    listaPruebaBubble = listaPrueba

    inicio = time.time()
    bubbleSort(listaPruebaBubble)
    fin =  time.time()
    total = fin- inicio
    print("Caso intermedio(lista desordenada)\n Tiempo:", total,  "\n")
    
    inicio = time.time()
    bubbleSort(listaPruebaBubble)
    fin =  time.time()
    total = fin- inicio
    print("Mejor escenario (lista ordenada)\n Tiempo:", total, "\n")
    
    listaPruebaBubble.reverse()
    inicio = time.time()
    bubbleSort(listaPruebaBubble)
    fin =  time.time()
    total = fin- inicio
    print("Peor caso(lista inversa)\n Tiempo:", total, "\n")
     
    
    print("===========================================================================")
    print("Ordenando con el método SelectionSort\n")

    inicioS = time.time()
    selectionSort(listaPruebaSelection)
    finS =  time.time()
    totalS = finS- inicioS
    print("Caso intermedio(lista desordenada)\n Tiempo:", totalS,  "\n")
  
    inicioS = time.time()
    selectionSort(listaPruebaSelection)
    finS =  time.time()
    totalS = finS- inicioS
    print("Mejor escenario (lista ordenada)\n Tiempo:", totalS, "\n")

    inicioS = time.time()
    selectionSort(listaPruebaSelection)
    finS =  time.time()
    totalS = finS- inicioS
    print("Peor caso(lista inversa)\n Tiempo:", totalS, "\n")

#==============================================================================================

def mainExtra(M):

    print("===========================================================================")
    print("Experimentación con otras intancias\n")

    listaPruebaEx = []
    

    largoListaPruebaEx = M

    numero = random.randint(700,100000)
    for indice in range(largoListaPruebaEx) :
        for potencia in range(1,M):
            listaPruebaEx.append(numero ** potencia)
    

    
    print("Parámetro M indicado (largo de la lista a ordenar): ", M)
    print("===========================================================================")
    print("Ordenando con el método BubbleSort\n")
   

    listaPruebaSelection = listaPruebaEx
    listaPruebaBubble = listaPruebaEx

    inicio = time.time()
    bubbleSort(listaPruebaBubble)
    fin =  time.time()
    total = fin- inicio
    print("Caso intermedio(lista desordenada)\n Tiempo:", total,  "\n")
    
    inicio = time.time()
    bubbleSort(listaPruebaBubble)
    fin =  time.time()
    total = fin- inicio
    print("Mejor escenario (lista ordenada)\n Tiempo:", total, "\n")
    
    listaPruebaBubble.reverse()
    inicio = time.time()
    bubbleSort(listaPruebaBubble)
    fin =  time.time()
    total = fin- inicio
    print("Peor caso(lista inversa)\n Tiempo:", total, "\n")
     
    
    print("===========================================================================")
    print("Ordenando con el método SelectionSort\n")

    inicioS = time.time()
    selectionSort(listaPruebaSelection)
    finS =  time.time()
    totalS = finS- inicioS
    print("Caso intermedio(lista desordenada)\n Tiempo:", totalS,  "\n")
  
    inicioS = time.time()
    selectionSort(listaPruebaSelection)
    finS =  time.time()
    totalS = finS- inicioS
    print("Mejor escenario (lista ordenada)\n Tiempo:", totalS, "\n")

    inicioS = time.time()
    selectionSort(listaPruebaSelection)
    finS =  time.time()
    totalS = finS- inicioS
    print("Peor caso(lista inversa)\n Tiempo:", totalS, "\n")

#==============================================================================================
  
main(100)
mainExtra(100)




