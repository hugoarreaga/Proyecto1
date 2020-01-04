#include <stdio.h>
int main(){
    int menu = 0;
    while(menu != 5){
        printf("-*-*-*-*-*-*-*-*-*-*-*-*-\n*** ELIJA UNA OPCCION: ***\n1. Insertar Registro \n2. Modificar Registro \n3. Eliminar\n4. Mostrar\n5. Salir\n-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        scanf("%d", &menu);

        switch ( menu ){
        case 1:
            printf(" ***NUEVO REGISTRO: ***\n");
            insertar();
            break;
        case 2:
            buscar();
            break;

        case 3:
            eliminar();
            break;
        case 4:
            imprimir();
            break;
        case 5:
            break;

        }
    }

}
typedef struct nodo{
    int codigo;
    char nombre[20];
    int edad;
    int telefono;

    struct nodo *siguiente;
    struct nodo *anterior;
} nodo;



nodo* primero = NULL;
nodo* ultimo = NULL;

void insertar(int cod);
void imprimir();
void buscar();
void eliminar();

void insertar(codigo){

    nodo* nuevo = (nodo*)malloc(sizeof(nodo));


    printf("ingrese el codigo de usuario: \n");
    scanf("%d", &nuevo->codigo);

    printf("ingrese el nombre de usuario: \n");
    scanf(" %s", &nuevo->nombre);

    printf("ingrese la edad de usuario: \n");
    scanf("%d", &nuevo->edad);

    printf("ingrese el telefono de usuario: \n");
    scanf("%d", &nuevo->telefono);
    printf("\n");
    if(primero == NULL){
        primero = nuevo;
        primero ->siguiente = NULL;
        primero ->anterior = NULL;
        ultimo = primero;
    }else{
        ultimo ->siguiente = nuevo;
        nuevo ->siguiente = NULL;
        nuevo ->anterior = ultimo;
        ultimo = nuevo;
    }


}

void imprimir(){
    nodo* actual = (nodo*)malloc(sizeof(nodo));
    actual = primero;
    if(primero != NULL){
            printf("\nLISTA DE USUARIOS : ");
        while(actual != NULL){
            printf("\ncodigo   : ");
            printf("%d", actual->codigo);
            printf("\nnombre   : ");
            printf("%s", actual->nombre);
            printf("\nedad     : ");
            printf("%d", actual->edad);
            printf("\ntelefono : ");
            printf("%d", actual->telefono);
            printf("\n\n");
            actual = actual ->siguiente;
        }
    }
}

void buscar(){
    nodo* actual = (nodo*)malloc(sizeof(nodo));
    actual = primero;
    int nodoBuscar = 0, encontrado=0;

    printf("ingrese el codigo de usuario a buscar: \n");
    scanf("%d", &nodoBuscar);

    if(primero != NULL){

        while(actual != NULL){
            if(actual->codigo ==nodoBuscar ){
                printf("ingrese el nuevo nombre de usuario: \n");
                scanf(" %s", &actual->nombre);

                printf("ingrese la nueva edad de usuario: \n");
                scanf("%d", &actual->edad);

                printf("ingrese el nuevo telefono de usuario: \n");
                scanf("%d", &actual->telefono);
                encontrado = 1;

            }

            actual = actual ->siguiente;
        }
        if(encontrado==0){
            printf("\n Nodo no encontrado\n\n");
        }
    }
}

void eliminar(){
    nodo* actual = (nodo*)malloc(sizeof(nodo));
    actual = primero;
    nodo* anterior = (nodo*)malloc(sizeof(nodo));
    anterior = NULL;

    int nodoBuscar = 0, encontrado=0;

    printf("ingrese el codigo de usuario a eliminar: \n");
    scanf("%d", &nodoBuscar);

    if(actual != NULL && encontrado!= 1){

        while(actual != NULL && encontrado != 1){
            if(actual->codigo ==nodoBuscar ){
                if(actual == primero){
                    primero = primero->siguiente;
                }else if(actual == ultimo){
                    anterior->siguiente = NULL;
                    ultimo = anterior;
                }else{
                    anterior ->siguiente = actual->siguiente;
                }
                printf("\n Nodo eliminado exitosamente\n\n");
                encontrado =1;

            }
            anterior = actual;
            actual = actual->siguiente;

            actual = actual ->siguiente;
        }
        if(encontrado ==0){
            printf("\n EL NODO NO EXISTE__ \n\n");
        }
    }
}
