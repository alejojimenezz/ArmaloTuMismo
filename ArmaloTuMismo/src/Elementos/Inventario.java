/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Elementos;

import java.util.*;


public class Inventario {
//metodos y hashmap por cada tipo
    //procesadores
    
    
    public Map<Integer, CPU> CPU=new HashMap<Integer, CPU>();
    public Map<Integer, CPUCooler> cooler=new HashMap<Integer, CPUCooler>();
    public Map<Integer, Case> Cases=new HashMap<Integer, Case>();
    public Map<Integer, MotherBoard> MotherBoard=new HashMap<Integer, MotherBoard>();
    public Map<Integer, OS> Os=new HashMap<Integer, OS>();
    public Map<Integer, PowerSupply> Fuentes=new HashMap<Integer, PowerSupply>();
    public Map<Integer, RAM> RAM=new HashMap<Integer, RAM>();
    public Map<Integer, Storage> Storage=new HashMap<Integer, Storage>();
    public Map<Integer, VideoCard> VideoCard=new HashMap<Integer, VideoCard>();
   
    //CPU
    
    public CPU consultarCpu(Integer key){
    if  (CPU.get(key)== null) System.out.println("No existe componente con esa referencia");
    return CPU.get(key);
    }
    
    public void agregarCPU(Integer key, CPU e){
        CPU.put(key, e);
    }

    public void eliminarCPU(Integer key){
        CPU.remove(key);
    }
    
    public Map<Integer, CPU> getCPU() {
        return CPU;
    }

    public void setCPU(Map<Integer, CPU> cpu) {
        this.CPU = cpu;
    }

    //Coolers

    public CPUCooler consultarCooler(Integer key){
    if  (cooler.get(key)== null) System.out.println("No existe componente con esa referencia");
    return cooler.get(key);
    }
    
    public void agregarCooler(Integer key, CPUCooler e){
        cooler.put(key, e);
    }

    public void eliminarCooler(Integer key){
        cooler.remove(key);
    }
    
    public Map<Integer, CPUCooler> getCooler() {
        return cooler;
    }

    public void setCooler(Map<Integer, CPUCooler> cpu) {
        this.cooler = cpu;
    }
 
    //case
    
    public Case consultarCase(Integer key){
    if  (Cases.get(key)== null) System.out.println("No existe componente con esa referencia");
    return Cases.get(key);
    }
    
    public void agregarCase(Integer key, Case e){
        Cases.put(key, e);
    }

    public void eliminarCase(Integer key){
        Cases.remove(key);
    }
    
    public Map<Integer, Case> getCase() {
        return Cases;
    }

    public void setCases(Map<Integer, Case> cases) {
        this.Cases = cases;
    }
    
    //motherboards
    
    public MotherBoard consultarMother(Integer key){
    if  (MotherBoard.get(key)== null) System.out.println("No existe componente con esa referencia");
    return MotherBoard.get(key);
    }
    
    public void agregarMother(Integer key, MotherBoard e){
        MotherBoard.put(key, e);
    }

    public void eliminarMother(Integer key){
        MotherBoard.remove(key);
    }
    
    public Map<Integer, MotherBoard> getMother() {
        return MotherBoard;
    }

    public void setMotherBoard(Map<Integer, MotherBoard> MB) {
        this.MotherBoard = MB;
    }
    
    //OS
    
    public OS consultarOs(Integer key){
    if  (Os.get(key)== null) System.out.println("No existe componente con esa referencia");
    return Os.get(key);
    }
    
    public void agregarOs(Integer key, OS e){
        Os.put(key, e);
    }

    public void eliminarOs(Integer key){
        cooler.remove(key);
    }
    
    public Map<Integer, OS> getOs() {
        return Os;
    }

    public void setOs(Map<Integer, OS> os) {
        this.Os = os;
    }
    
    //PowerSupply
    
    public PowerSupply consultarPower(Integer key){
    if  (Fuentes.get(key)== null) System.out.println("No existe componente con esa referencia");
    return Fuentes.get(key);
    }
    
    public void agregarPower(Integer key, PowerSupply e){
        Fuentes.put(key, e);
    }

    public void eliminarPower(Integer key){
        Fuentes.remove(key);
    }
    
    public Map<Integer, PowerSupply> getPower() {
        return Fuentes;
    }

    public void setPower(Map<Integer, PowerSupply> PS) {
        this.Fuentes = PS;
    }
    
    //RAM
    
    public RAM consultarRAM(Integer key){
    if  (RAM.get(key)== null) System.out.println("No existe componente con esa referencia");
    return RAM.get(key);
    }
    
    public void agregarRAM(Integer key, RAM e){
        RAM.put(key, e);
    }

    public void eliminarRAM(Integer key){
        RAM.remove(key);
    }
    
    public Map<Integer, RAM> getRAM() {
        return RAM;
    }

    public void setRAM(Map<Integer, RAM> ram) {
        this.RAM = ram;
    }
    
    //Storage
    
    public Storage consultarStorage(Integer key){
    if  (Storage.get(key)== null) System.out.println("No existe componente con esa referencia");
    return Storage.get(key);
    }
    
    public void agregarStorage(Integer key, Storage e){
        Storage.put(key, e);
    }

    public void eliminarStorage(Integer key){
        Storage.remove(key);
    }
    
    public Map<Integer, Storage> getStorage() {
        return Storage;
    }

    public void setStorage(Map<Integer, Storage> S) {
        this.Storage = S;
    }
    
    //VideoCard
    
    public VideoCard consultarVCard(Integer key){
    if  (VideoCard.get(key)== null) System.out.println("No existe componente con esa referencia");
    return VideoCard.get(key);
    }
    
    public void agregarVCard(Integer key, VideoCard e){
        VideoCard.put(key, e);
    }

    public void eliminarVCard(Integer key){
        VideoCard.remove(key);
    }
    
    public Map<Integer, VideoCard> getVCard() {
        return VideoCard;
    }

    public void setVCard(Map<Integer, VideoCard> VC) {
        this.VideoCard = VC;
    }
    
    
    
    
}
