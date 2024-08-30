public class UsuarioService {
    UsuarioRepo usuarioRepo;
    public UsuarioService(UsuarioRepo usuarioRepo){
        this.usuarioRepo = usuarioRepo;
    }

    public UsuarioDto crearUsuario(String name){
        if(name==null){
            throw new IllegalArgumentException("No ingreso el nombre");
        }
        return usuarioRepo.crearUsuario(name);
    }

    public UsuarioDto obtenerUser(int id){
        return usuarioRepo.obtenerUsuario(id);
    }
}
