class Box {
float l;
float w;
float h;
void volume() {

    System.out.println("the volume is : "+l*w*h);
}

Box(){
    l=0;
    w=0;
    h=0;
}

Box(float a){
    l=a;
    w=a;
    h=a;
}

Box(float a,float b){
    l=a;
    h=b;
    w=b;
}
}