package emition;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Models_Object.*;
import org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.DocumentResponse;
import org.datacontract.schemas._2004._07.ServiceSoap_UBL2__0_Response.UploadAttachmentResponse;
import org.tempuri.*;

public class EmitionDocument {
	
	 private  FacturaGeneral factura;
	 private  ServiceLocator service = new ServiceLocator();
         private org.tempuri.attachment.ServiceLocator serviceAdj = new org.tempuri.attachment.ServiceLocator();
	
	 public void buildDocument(String nroDocument, String rangNumeration)
     {
		 factura = new FacturaGeneral(); // 1-2

         //Datos de la Factura
         factura.setConsecutivoDocumento(nroDocument); // fel_factura
         factura.setCantidadDecimales("6"); // nuevo
         factura.setFechaEmision("2018-05-10 07:28:00"); // fel_factura
         factura.setFechaFinPeriodoFacturacion("2019-04-01 00:00:00"); //  fel_factura
         factura.setFechaInicioPeriodoFacturacion("2019-04-01 00:00:00"); // fel_factura
         factura.setFechaPagoImpuestos("2019-07-24"); // nuevo
         factura.setFechaVencimiento("2018-05-26"); // fel_factura
         factura.setInformacionAdicional(new String[]{ "Nota de la Factura"}); // fel_factura
         factura.setMoneda("COP"); // fel_factura 
         factura.setPropina(""); // fel_factura
         factura.setRangoNumeracion(rangNumeration); // fel_factura //FV-1   o  NC-1 o ND-1   Dependiendo el tipo de documento  
         factura.setRedondeoAplicado("0.00"); // fel_factura
         factura.setTipoDocumento("01"); // fel_factura     // Del 01 al 09
         factura.setTipoOperacion("05"); // nuevo
         factura.setTotalAnticipos("0.00"); // fel_factura
         factura.setTotalBaseImponible("100.00"); // fel_factura
         factura.setTotalBrutoConImpuesto("119.00"); // fel_factura
         factura.setTotalCargosAplicados("10.00"); // fel_factura
         factura.setTotalDescuentos("0.00"); // fel_factura
         factura.setTotalMonto("129.00"); // fel_factura
         factura.setTotalProductos("1"); // fel_factura
         factura.setTotalSinImpuestos("0.00"); // fel_factura
       
      // Direccion - fel_direccion
         Direccion direccionGene = new Direccion(); // 

         direccionGene.setMunicipio("123"); // fel_direcciones
         direccionGene.setBuzon("POXBOX01"); // fel_direcciones
         direccionGene.setPiso("03"); // fel_direcciones
         direccionGene.setHabitacion("Principal"); // fel_direcciones
         direccionGene.setCalle("Principal"); // fel_direcciones
         direccionGene.setCalleAdicional("Los Chaimas"); // fel_direcciones
         direccionGene.setBloque("Bloque 16"); // fel_direcciones
         direccionGene.setNombreEdificio("Chaima"); // fel_direcciones
         direccionGene.setNumeroEdificio("16a"); // fel_direcciones
         direccionGene.setUbicacion(""); // fel_direcciones
         direccionGene.setDepartamentoOrg("Tecnologia"); // fel_direcciones
         direccionGene.setACuidadoDe("Mengano"); // fel_direcciones
         direccionGene.setNumeroParcela("3"); // fel_direcciones
         direccionGene.setSubDivision("parcela"); // fel_direcciones
         direccionGene.setCiudad("Bogota DC"); // fel_direcciones
         direccionGene.setZonaPostal("6101"); // fel_direcciones
         direccionGene.setDepartamento("Cundinamarca"); // fel_direcciones
         direccionGene.setCodigoDepartamento("11"); // fel_direcciones
         direccionGene.setRegion("sur"); // fel_direcciones
         direccionGene.setDistrito("Los Andes"); // fel_direcciones
         direccionGene.setCorreccionHusoHorario("-66.01"); // fel_direcciones
         direccionGene.setDireccion("calle 80 #69 70"); // fel_direcciones
         direccionGene.setPais("VE"); // fel_direcciones
         direccionGene.setLenguaje("ES"); // fel_direcciones
         //direccionGene.setALaAtenci�nDe("fulano de tal"); // fel_direcciones - eliminado 

         // Coordenadas - fel_coordenadas
         Coordenadas cord = new Coordenadas(); // fel_coordenadas
         cord.setGradosLatitud("4"); // fel_coordenadas
         cord.setMinutosLatitud("41"); // fel_coordenadas
         cord.setOrientacionLatitud("N"); // fel_coordenadas
         cord.setGradosLongitud("74"); // fel_coordenadas
         cord.setMinutosLongitud("4"); // fel_coordenadas
         cord.setOrientacionLongitud("O"); // fel_coordenadas
         direccionGene.setLocalizacion(new Coordenadas[] {cord}); // fel_coordenadas


         // Extras -  fel_camposadicionales
         Extensible destinatario = new Extensible(); // fel_camposadicionales
         destinatario.setNombre("48"); // codigo TFHKA  // fel_camposadicionales
         destinatario.setValor("Maria del pilar reyes"); // fel_camposadicionales
         destinatario.setControlInterno1(""); // fel_camposadicionales
         destinatario.setControlInterno2(""); // fel_camposadicionales

         // autorizado - fel_autorizados                
         Autorizado autorizado = new Autorizado();
         autorizado.setDireccion(direccionGene);
         autorizado.setEmail("email@gmail.com");
         autorizado.setNombreComercial("Persona Autorizada");
         autorizado.setNombreContacto("Pedro Paramo");
         autorizado.setNota("Llamar al contacto");
         autorizado.setNumeroDocumento("123456789");
         autorizado.setNumeroDocumentoDV("1");
         autorizado.setRazonSocial("Persona Autorizada");
         autorizado.setTelefax("124578");
         autorizado.setTelefono("789456");
         autorizado.setTipoIdentificacion("31");

         autorizado.setExtras(new Extensible[] {destinatario}); // fel_camposadicionales

         factura.setAutorizado(autorizado);
         // documentos referenciados - fel_documentoreferenciado
         DocumentoReferenciado documentoreferenciado = new DocumentoReferenciado(); // fel_documentoreferenciado
         documentoreferenciado.setNumeroDocumento("PRUE21"); //  fel_documentoreferenciado
         documentoreferenciado.setCufeDocReferenciado("4191110db1f3c8060a4ce34e40c6ec6541ac1bd248264624bfe1b60fdf02aea7e15c5a49969cc08f498b938a9e3cd954");
         documentoreferenciado.setTipoCUFE("CUFE-SHA384");
         documentoreferenciado.setFecha("2019-04-29"); // fel_documentoreferenciado
         documentoreferenciado.setTipoDocumento("01"); // fel_documentoreferenciado
         documentoreferenciado.setTipoDocumentoCodigo("01"); // fel_documentoreferenciado

         documentoreferenciado.setCodigoEstatusDocumento("01"); // nuevo
         documentoreferenciado.setCodigoInterno("1"); // nuevo
         documentoreferenciado.setFechaFinValidez("2019-04-29"); // nuevo
         documentoreferenciado.setFechaInicioValidez("2019-04-29"); // nuevo

         String[] descripcion = new String[1]; // nuevo
         descripcion[0] = "Descripcion, poder legal para Facturas mandato"; // nuevo
         documentoreferenciado.setDescripcion(descripcion); // nuevo

         factura.setDocumentosReferenciados(new DocumentoReferenciado[] { documentoreferenciado}); // fel_documentoreferenciado

         // Impuestos generales - fel_impuestos
         FacturaImpuestos impuestosGenerales = new FacturaImpuestos(); // fel_impuestos
         impuestosGenerales.setBaseImponibleTOTALImp("19.00"); // fel_impuestos
         impuestosGenerales.setCodigoTOTALImp("01"); // fel_impuestos
         impuestosGenerales.setPorcentajeTOTALImp("19.00"); // fel_impuestos
         impuestosGenerales.setValorTOTALImp("0.00"); // fel_impuestos
         impuestosGenerales.setControlInterno(""); // fel_impuestos
         impuestosGenerales.setUnidadMedida("KGM"); // fel_impuestos
         impuestosGenerales.setUnidadMedidaTributo("0.00"); // fel_impuestos
         impuestosGenerales.setValorTributoUnidad("0.00"); // fel_impuestos

         factura.setImpuestosGenerales(new FacturaImpuestos[] {impuestosGenerales});
         // impuestos totales  - fel_impuestostotales
         ImpuestosTotales impTotales = new ImpuestosTotales(); // fel_impuestostotales

         impTotales.setCodigoTOTALImp("01"); // fel_impuestostotales
         impTotales.setMontoTotal("0.00"); // fel_impuestostotales

         factura.setImpuestosTotales(new ImpuestosTotales[] { impTotales }); // fel_impuestostotales


         // Cargos Descuentos - campos nuevos
         CargosDescuentos cargosDescuentosGlobales = new CargosDescuentos(); // fel_cargosdescuentos
         cargosDescuentosGlobales.setSecuencia("1"); // nuevo
         cargosDescuentosGlobales.setIndicador("1"); // fel_cargosdescuentos
         cargosDescuentosGlobales.setCodigo("11"); // fel_cargosdescuentos
         cargosDescuentosGlobales.setDescripcion("Descuento cliente frecuente"); // fel_cargosdescuentos
         cargosDescuentosGlobales.setPorcentaje("02.50"); // fel_cargosdescuentos
         cargosDescuentosGlobales.setMonto("0000001.00"); // fel_cargosdescuentos
         cargosDescuentosGlobales.setMontoBase("0000001.00"); // fel_cargosdescuentos

         factura.setCargosDescuentos(new CargosDescuentos[] {cargosDescuentosGlobales}); // fel_cargosdescuentos

         // entrega de mercancia - fel_entregamercancia
         Entrega entregaMerc = new Entrega(); // 2

         entregaMerc.setFechaEfectivaSalida("2019-07-24 14:00:00"); // 
         entregaMerc.setDireccionEntrega(direccionGene); // 
         entregaMerc.setIdentificacionTransporte("1"); // 
         entregaMerc.setMatriculaTransporte("ABCD123"); // 
         entregaMerc.setFechaSolicitada("2019-07-24 14:00:00"); // 
         entregaMerc.setFechaEstimada("2019-07-26 14:00:00"); // 
         entregaMerc.setFechaReal("2019-07-24 14:00:00"); // 
         entregaMerc.setDireccionDespacho(direccionGene); // 
         //entregaMerc.setDatosdelDespacho("Datos despacho"); // eliminado
         entregaMerc.setExtras(new Extensible[] {destinatario});


         // Datos Transportista - fel_datosdeltransportista
         DatosDelTransportista transportista = new DatosDelTransportista(); // 

         transportista.setIndicadordeAtencion("1"); // 
         transportista.setIndicadordeCuidado("1"); // 
         transportista.setNombreResponsableEntrega("Pedrito Perez"); // 
         transportista.setDireccionResponsableEntrega(direccionGene);  //  //"avenida Chile # 120- 21",
         transportista.setTipoIdentificacion("31"); // 
         transportista.setDetallesTributarios(null); // 

         transportista.setEmail("mail@gmail.com"); // nuevo
         transportista.setNombreContacto("Fulanito Gonzales");
         transportista.setNota("Mercancia delicada");
         transportista.setNumeroIdentificacion("800123456");
         transportista.setNumeroIdentificacionDV("2");
         transportista.setNumeroMatriculaMercantil("QWERT");
         transportista.setPrefijoFacturacion("PRUE");
         transportista.setTelefax("123456789");
         transportista.setTelefono("3451269");
         transportista.setTransportadorNombre("Juan Lopez");
         transportista.setTransportadorNumeroDocumento("40012365");
         transportista.setTransportadorNumeroDocumentoDV("1");
         transportista.setTransportadorTipoIdentificacion("13");
         transportista.setDireccionResponsableEntrega(direccionGene);
         
         Obligaciones obligaciones = new Obligaciones();
         obligaciones.setObligaciones("O-11");
         obligaciones.setRegimen("04");
         transportista.setResponsabilidadesRut(new Obligaciones[] {obligaciones});

         transportista.setExtras(new Extensible[] {destinatario});
      
         Tributos tributo = new Tributos();
         tributo.setCodigoImpuesto("01");
         transportista.setDetallesTributarios(new Tributos[] { tributo});

         entregaMerc.setDatosTransportistas(transportista); // 2

         factura.setEntregaMercancia(entregaMerc); // 2

         
         // Terminos Entregas - campos nuevos fel_terminosentrega
         TerminosDeEntrega terminos = new TerminosDeEntrega(); // fel_terminosentrega

         terminos.setIdentificacion("200311301"); // nuevo
         terminos.setCostoTransporte("100.00"); // fel_terminosentrega
         terminos.setCodigoCondicionEntrega("CFR"); // fel_terminosentrega
         terminos.setResponsableEntrega("cliente"); // fel_terminosentrega
         terminos.setDireccionEntrega(direccionGene); // fel_terminosentrega
         terminos.setMonto("100.00"); // nuevo
         terminos.setCargosDescuentos( new CargosDescuentos[]{cargosDescuentosGlobales}); // fel_cargosdescuentos  
         terminos.setDireccionEntrega(direccionGene);
         factura.setTerminosEntrega(terminos); // fel_terminosentrega

         // Tasa De Cambio - fel_tasadecambio
         TasaDeCambio tasacamb = new TasaDeCambio();  // fel_tasadecambio
         tasacamb.setBaseMonedaDestino("0000001.00");
         tasacamb.setBaseMonedaOrigen("0000001.00");
         tasacamb.setFechaDeTasaDeCambio("2019-01-01");  // fel_tasadecambio
         tasacamb.setMonedaDestino("USD");  // fel_tasadecambio
         tasacamb.setMonedaOrigen("COP");  // fel_tasadecambio
         tasacamb.setTasaDeCambio("000000.50");
         tasacamb.setIndicadorDeTasa("123456"); // nuevo
         tasacamb.setOperadorCalculo("Division"); // nuevo
         factura.setTasaDeCambio(tasacamb);
         // Tasa De Cambio - fel_tasadecambioalternativa NUEVA
         TasaDeCambioAlternativa tasaAlt = new TasaDeCambioAlternativa();  // fel_tasadecambioalternativa
         tasaAlt.setBaseMonedaDestino("0000001.00");
         tasaAlt.setBaseMonedaOrigen("0000001.00");
         tasaAlt.setFechaDeTasaDeCambio("2019-01-01");  // fel_tasadecambioalternativa
         tasaAlt.setMonedaDestino("USD");  // fel_tasadecambioalternativa
         tasaAlt.setMonedaOrigen("COP");  // fel_tasadecambioalternativa
         tasaAlt.setTasaDeCambio("000000.50");          
         tasaAlt.setIndicadorDeTasa("123456"); // fel_tasadecambioalternativa
         tasaAlt.setOperadorCalculo("Division"); // fel_tasadecambioalternativa
         factura.setTasaDeCambioAlternativa(tasaAlt);
         //Cliente de la factura - fel_cliente
         Cliente cliente = new Cliente(); // fel_cliente
         cliente.setNombreRazonSocial("JET IMPRESORES LTDA"); // fel_cliente
         cliente.setTipoPersona("1"); // fel_cliente
         cliente.setSegundoNombre(""); // fel_cliente
         cliente.setApellido(""); // fel_cliente
         cliente.setTipoIdentificacion("31"); // fel_cliente
         cliente.setNumeroDocumento("8600521517"); // fel_cliente
         cliente.setNumeroIdentificacionDV("2");// nuevo
         cliente.setTelefono("3110971-3110597"); // fel_cliente
         cliente.setEmail("test@thefactoryhka.com"); // fel_cliente
         cliente.setNotificar("SI"); // fel_cliente
         cliente.setNombreComercial("The Factory HKA"); // fel_cliente
         cliente.setActividadEconomicaCIIU("0010"); // nuevo
         cliente.setNombreContacto("Luis Salazar"); // nuevo
         cliente.setTelefax("123456789"); // nuevo
         cliente.setNota("Se debe llamar antes dae facturar"); // nuevo
         cliente.setResponsabilidadesRut(new Obligaciones[] { obligaciones });
      
         Tributos tributos = new Tributos();
         tributos.setCodigoImpuesto("01");
         cliente.setDetallesTributarios(new Tributos[]{ tributos});

         InformacionLegal informacionLegal = new InformacionLegal();

         informacionLegal.setCodigoEstablecimiento("00001");
         informacionLegal.setNombreRegistroRUT("The Factory HKA");
         informacionLegal.setNumeroIdentificacion("900390126");
         informacionLegal.setNumeroIdentificacionDV("6");
         informacionLegal.setTipoIdentificacion("31");
         informacionLegal.setPrefijoFacturacion("BC");
         informacionLegal.setNumeroMatriculaMercantil("00515557");
         
         cliente.setInformacionLegalCliente(informacionLegal);
         cliente.setDireccionCliente(direccionGene); // 2da
         cliente.setDireccionFiscal(direccionGene);
         cliente.setExtras(new Extensible[] { destinatario});
        
         factura.setCliente(cliente);

         // Anticipos - fel_anticipos
         Anticipos anticipos = new Anticipos(); // fel_anticipos
         anticipos.setId("1"); // fel_anticipos
         anticipos.setMontoPagado("000010.00");
         anticipos.setFechaDeRecibido("2019-01-02"); // fel_anticipos
         anticipos.setFechadePago("2019-01-01"); // fel_anticipos
         anticipos.setHoraDePago("8:00:00"); // fel_anticipos
         anticipos.setInstrucciones("Texto libre"); // fel_anticipos
         factura.setAnticipos(new Anticipos[]{anticipos}); // fel_anticipos
            
         // Medios de Pago - fel_mediosdepago
         MediosDePago mediosDePago = new MediosDePago(); // fel_mediosdepago
         mediosDePago.setFechaDeVencimiento("2019-01-01"); // fel_mediosdepago
         mediosDePago.setMedioPago("10"); // fel_mediosdepago
         mediosDePago.setMetodoDePago("1"); // fel_mediosdepago
         mediosDePago.setNumeroDeReferencia("Referencia de pago 1"); // fel_mediosdepago

         mediosDePago.setCodigoReferencia("123QBCV");
         mediosDePago.setNumeroDias("22"); //
         mediosDePago.setCodigoBanco("3356");
         mediosDePago.setNombreBanco("Bancolombia");
         mediosDePago.setNumeroTransferencia("982467");
         mediosDePago.setCodigoCanalPago("0312");
         mediosDePago.setExtras(new Extensible[]{destinatario});

         factura.setMediosDePago(new MediosDePago[]{mediosDePago}); // fel_mediosdepago

         // Detalles de la factura 
         FacturaDetalle detalle = new FacturaDetalle(); //

         detalle.setSecuencia("1");  // fel_productos
         detalle.setCodigoProducto("P000001");
         detalle.setDescripcion("Impresora HKA80");
         detalle.setCantidadUnidades("0000002.00");
         detalle.setUnidadMedida("KGM");  // fel_productos
         detalle.setPrecioVentaUnitario("100.00"); // fel_productos               
         detalle.setPrecioTotalSinImpuestos("000090.00");
         detalle.setPrecioTotal("90.00"); // fel_productos
         detalle.setSeriales("ABC123,ABC456"); // fel_productos
         detalle.setMuestraGratis("1"); // fel_productos
         detalle.setNota("Producto nuevo"); // fel_productos
         detalle.setPrecioReferencia("100.00"); // fel_productos
         detalle.setCodigoTipoPrecio("01"); // fel_productos
         detalle.setCantidadPorEmpaque("1"); // fel_productos
         //detalle.setCantidadIndividual("1.00"); // fel_productos
         detalle.setDescripcionTecnica("Impresora t�rmica de punto de venta, ideal para puntos de venta con alto rendimiento"); // fel_productos
         detalle.setMarca("HKA"); // fel_productos
         detalle.setModelo("HKA80"); // fel_productos
         detalle.setSubCodigoProducto("SUB-P000001"); // fel_productos
         detalle.setCodigoFabricante("HKA800001"); // fel_productos
         detalle.setSubCodigoFabricante("SUB-HKA800001"); // fel_productos
         detalle.setNombreFabricante("The Factory HKA");
         detalle.setEstandarCodigoProducto("GTIN");
         detalle.setEstandarCodigo("HKA80");
         detalle.setEstandarCodigoID("801236");
         detalle.setEstandarCodigoNombre("GTIN");
         detalle.setEstandarCodigoIdentificador("010");
         detalle.setEstandarSubCodigoProducto("");
         detalle.setEstandarOrganizacion("");
         detalle.setCodigoIdentificadorPais("CO"); // fel_productos
         detalle.setMandatorioNumeroIdentificacion("900390126");
         detalle.setMandatorioNumeroIdentificacionDV("6");
         detalle.setMandatorioTipoIdentificacion("31");
         detalle.setCantidadReal("0000001.00");
         detalle.setCantidadRealUnidadMedida("KGM");
         detalle.setTipoAIU("Servicio");



         //Impuestos de la factura - fel_impuestos
         FacturaImpuestos impuesto1 = new FacturaImpuestos(); // fel_impuestos
         impuesto1.setCodigoTOTALImp("01"); // fel_impuestos
         impuesto1.setBaseImponibleTOTALImp("19.00"); // fel_impuestos
         impuesto1.setValorTOTALImp("0.00"); // fel_impuestos
         impuesto1.setPorcentajeTOTALImp("0.00"); // fel_impuestos
         impuesto1.setControlInterno(""); // fel_impuestos
         impuesto1.setUnidadMedida("KGM"); // fel_impuestos
         impuesto1.setUnidadMedidaTributo("0.00"); // fel_impuestos
         impuesto1.setValorTributoUnidad("0.00"); // fel_impuestos

         detalle.setImpuestosDetalles( new FacturaImpuestos[]{impuesto1}); // fel_impuestos
       
         ImpuestosTotales impTotalesdet = new ImpuestosTotales();
         impTotalesdet.setCodigoTOTALImp("01");
         impTotalesdet.setMontoTotal("0.00");
         detalle.setImpuestosTotales(new ImpuestosTotales[]{ impTotalesdet });

         // Cargos Descuentos del Detalle de Factura - campos nuevos       
         CargosDescuentos cargosDescuentos = new CargosDescuentos(); // fel_cargosdescuentos
         cargosDescuentos.setSecuencia("1"); // fel_cargosdescuentos
         cargosDescuentos.setIndicador("1"); // fel_cargosdescuentos
         cargosDescuentos.setCodigo("11"); // fel_cargosdescuentos
         cargosDescuentos.setDescripcion("Descuento cliente frecuente"); // fel_cargosdescuentos
         cargosDescuentos.setPorcentaje("02.50"); // fel_cargosdescuentos
         cargosDescuentos.setMonto("0000001.00");
         cargosDescuentos.setMontoBase("0000001.00");

         detalle.setCargosDescuentos( new CargosDescuentos[]{ cargosDescuentos }); // fel_cargosdescuentos

         // detalle informacion adicional         
         LineaInformacionAdicional informacionAdicional = new LineaInformacionAdicional(); // fel_lineainformacionadicional
         informacionAdicional.setSecuencia("1"); // fel_lineainformacionadicional
         informacionAdicional.setTipo("1"); // fel_lineainformacionadicional
         informacionAdicional.setNombre("Uso Vehiculo"); // fel_lineainformacionadicional
         informacionAdicional.setValor("Particular"); // fel_lineainformacionadicional
         informacionAdicional.setCodigo("01");
         informacionAdicional.setDescripcion("Texto Libre");
         informacionAdicional.setFechaInicio("2019-05-01");
         informacionAdicional.setFechaFin("2019-06-01");
         informacionAdicional.setCantidad("0.00");
         informacionAdicional.setCodigoInterno1("");
         informacionAdicional.setCodigoInterno2("");

         detalle.setInformacionAdicional( new LineaInformacionAdicional[] {informacionAdicional}); // fel_lineainformacionadicional


         detalle.setDocumentosReferenciados( new DocumentoReferenciado[] {documentoreferenciado});
         
         factura.setDetalleDeFactura( new FacturaDetalle[]{ detalle }); // fel_impuestos
              
         // Orden de Compra - campos nuevos 2da
         OrdenDeCompra ordenDeCompra = new OrdenDeCompra(); // fel_OrdendeCompra

         ordenDeCompra.setNumeroOrden("1233456"); // fel_OrdendeCompra
         ordenDeCompra.setFecha("2019-04-29 00:00:00"); // fel_OrdendeCompra
         ordenDeCompra.setNumeroPedido("321456"); // fel_OrdendeCompra
         ordenDeCompra.setTipoOrden("1"); // fel_OrdendeCompra
         ordenDeCompra.setCodigoCliente("987654"); // fel_OrdendeCompra
         ordenDeCompra.setUuid("85b5cfa4-16af-48a0-9388-501e519ed659"); // fel_OrdendeCompra
         ordenDeCompra.setTipoCUFE("CUFE-SHA384");
         ordenDeCompra.setDocumentoReferencia(documentoreferenciado);

         factura.setOrdenDeCompra(new OrdenDeCompra[] { ordenDeCompra }); // fel_OrdendeCompra

         CondicionDePago condicionPago = new CondicionDePago();

         condicionPago.setIdentificador("01");
         condicionPago.setMedioPagoAsociado("01");
         condicionPago.setComentario("Nota");
         condicionPago.setMontoMulta("100.00");
         condicionPago.setMonto("100.00");
         condicionPago.setPorcentajePago("0.00");
         condicionPago.setMontoPenalidad("12.00");
         condicionPago.setCodigoEvento("2");
         condicionPago.setDuracionPeriodo("60");
         condicionPago.setDuracionPeriodoMedida("DAY");
         condicionPago.setFechaVencimiento("2019-04-30");
         condicionPago.setReferenciaAnticipo("123456");
         condicionPago.setPeriodoDesde("2019-04-30");
         condicionPago.setPeriodoHasta("2019-04-30");
         condicionPago.setPorcentajeDescuento("0.00");
         
         condicionPago.setExtras(new Extensible[]{destinatario});

         factura.setCondicionPago(new CondicionDePago[]{condicionPago});

         /*
         // aclaracion de notas - fel_aclaraciondenotas        
         AclaracionDeNotas aclaracion = new AclaracionDeNotas(); // fel_aclaraciondenotas

         aclaracion.setConsecutivoModificado("PRUE21"); // fel_aclaraciondenotas
         aclaracion.setCufeModificado("12wwrttsa"); // fel_aclaraciondenotas
         aclaracion.setTipoCorrecion("1"); // fel_aclaraciondenotas
         aclaracion.setRazonesNota(new String[]{"Error en documento"}); // fel_razonesnotas

         factura.setAclaracionDeNotas(new AclaracionDeNotas[]{aclaracion}); // fel_aclaraciondenotas
         */
     }
    
     public String sendDocument() throws ServiceException, RemoteException
     {
    	 String tokenEmpresa = "6fd155767f3069bb7ef8e205ebfb15ee254bfc0d";
    	 String tokenPassword = "ac77f9f02302407b06e7dd6f449d1a962f320285";
    	 IService port;
		try {
			port = service.getBasicHttpBinding_IService();
			
			DocumentResponse response = port.enviar(tokenEmpresa, tokenPassword, factura, "1");
			
			return response.getCodigo().toString() + "|" + response.getMensaje();
			
		} catch (ServiceException e1) {
			throw e1;
		}
         catch (RemoteException e) {
        	 throw e;
		}
     }
     
     public String sendAttachment(String pDocument) throws ServiceException, RemoteException
     {
         String tokenEmpresa = "6fd155767f3069bb7ef8e205ebfb15ee254bfc0d";
    	 String tokenPassword = "ac77f9f02302407b06e7dd6f449d1a962f320285";
    	 org.tempuri.attachment.IService port;
         CargarAdjuntos adjuntos = new CargarAdjuntos();
         
         adjuntos.setNumeroDocumento(pDocument);
         adjuntos.setEmail("pmoya@thefactoryhka.com");
         adjuntos.setEnviar("1");
         String archivo = "Hola Mundo \n"
                        + "Hola Linea 2 \n";
         adjuntos.setArchivo(archivo.getBytes());
         adjuntos.setFormato("txt");
         adjuntos.setNombre("Mi Archivo_Plano");
         adjuntos.setTipo("1");
         
		try {
			port = serviceAdj.getBasicHttpBinding_IService();
			
			UploadAttachmentResponse response = port.cargarAdjuntos(tokenEmpresa, tokenPassword, adjuntos);
			
			return response.getCodigo().toString() + "|" + response.getMensaje();
			
		} catch (ServiceException e1) {
			throw e1;
		}
         catch (RemoteException e) {
        	 throw e;
		}
     }

}
